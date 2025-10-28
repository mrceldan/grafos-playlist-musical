import java.util.ArrayList;

class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim) {
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);

        if (inicio != null && fim != null) {
            Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
            inicio.adicionarArestaSaida(aresta);
            fim.adicionarArestaEntrada(aresta);
            this.arestas.add(aresta);
        }
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                return this.vertices.get(i);
            }
        }
        return null;
    }

    public ArrayList<Vertice<TIPO>> getVertices() {
        return vertices;
    }

    public ArrayList<TIPO> buscaEmLargura(TIPO dadoInicio) {
        ArrayList<TIPO> resultado = new ArrayList<>();
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();

        Vertice<TIPO> atual = this.getVertice(dadoInicio);

        if (atual == null) return resultado;

        marcados.add(atual);
        fila.add(atual);

        while (fila.size() > 0) {
            Vertice<TIPO> visitado = fila.get(0);

            for (int i = 0; i < visitado.getArestasSaida().size(); i++) {
                Vertice<TIPO> proximo =
                        visitado.getArestasSaida().get(i).getFim();

                if (!marcados.contains(proximo)) {
                    marcados.add(proximo);
                    resultado.add(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }

        return resultado;
    }
}