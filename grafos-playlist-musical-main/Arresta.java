public class Arresta <Tipo> {
    private Vertice<Tipo> origem;
    private Vertice<Tipo> destino;
    private double peso;

    public Arresta(Vertice<Tipo> origem, Vertice<Tipo> destino, double peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice<Tipo> getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice<Tipo> origem) {
        this.origem = origem;
    }

    public Vertice<Tipo> getDestino() {
        return destino;
    }

    public void setDestino(Vertice<Tipo> destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}