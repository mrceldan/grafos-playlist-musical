public class ExemploGrafo {
    public static void main(String[] args) throws Exception {
        Grafo<String> grafo=new Grafo<>();
        grafo.adicionarVertice("Paulo");
        grafo.adicionarVertice("Ana");
        grafo.adicionarVertice("Carlos");
        grafo.adicionarVertice("Beatriz");

        grafo.adicionarArresta("Paulo", "Ana", 1);
        grafo.adicionarArresta("Ana", "Carlos", 2);
        grafo.adicionarArresta("Carlos", "Beatriz", 3);

        grafo.BuscaemLargura();
    }
}
