class Aresta<TIPO> {
    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Vertice<TIPO> getFim() { return fim; }
    public Double getPeso() { return peso; }
}