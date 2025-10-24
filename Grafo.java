import java.util.ArrayList;
public class Grafo<Tipo> {
    private ArrayList<Vertice<Tipo>> vertices;
    private ArrayList<Arresta<Tipo>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<Tipo>>();
        this.arestas = new ArrayList<Arresta<Tipo>>();
    }

    public void adicionarVertice(Tipo dado) {
        Vertice<Tipo> novoVertice = new Vertice<>(dado);
        this.vertices.add(novoVertice);
    }
    public void adicionarArresta(Tipo dadoOrigem, Tipo dadoDestino, double peso) throws Exception {
        Vertice<Tipo> origem = this.getVertice(dadoOrigem);
        Vertice<Tipo> destino = this.getVertice(dadoDestino);

        if (origem == null || destino == null) {
        String mensagem = "";
        if (origem == null) {
            mensagem += "Origem (Música) não encontrada. ";
        }
        if (destino == null) {
            mensagem += "Destino (Música) não encontrado. ";
        }
        // Lança a exceção com uma mensagem mais detalhada
        throw new Exception("Erro ao adicionar aresta: " + mensagem.trim());
    }
    
        Arresta<Tipo> novaArresta = new Arresta<>(origem, destino, peso);
        origem.adicionarArestaSaida(novaArresta);
        destino.adicionarArestaEntrada(novaArresta);
        this.arestas.add(novaArresta);
        
    }
    public Vertice<Tipo> getVertice(Tipo dado) {
        Vertice<Tipo> verticeEncontrado = null;
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                verticeEncontrado = this.vertices.get(i);
                break;
            }
        }
         return verticeEncontrado;
    }

    public void BuscaemLargura() {
        ArrayList<Vertice<Tipo>> visitados = new ArrayList<>();
        ArrayList<Vertice<Tipo>> fila = new ArrayList<>();

        Vertice<Tipo> verticeInicio = this.vertices.get(0);
        visitados.add(verticeInicio);
        System.out.println(verticeInicio.getDado());
        fila.add(verticeInicio);
       
        while (fila.size() > 0) {
            Vertice<Tipo> verticeAtual = fila.get(0);

            for (int i=0; i< verticeAtual.getArestasSaida().size(); i++) {
                Vertice<Tipo> vizinho = verticeAtual.getArestasSaida().get(i).getDestino();
                if (!visitados.contains(vizinho)) {
                    visitados.add(vizinho);
                    System.out.println(vizinho.getDado());
                    fila.add(vizinho);
                }
            }
            fila.remove(0);
        }
    }

}
