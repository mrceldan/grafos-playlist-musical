
import java.util.ArrayList;

public class Vertice <Tipo> {
    private Tipo dado;
    private ArrayList<Arresta<Tipo>> arestasEntrada;
    private ArrayList<Arresta<Tipo>> arestasSaida;

    public Vertice(Tipo dado) {
        this.dado = dado;
        this.arestasEntrada = new ArrayList<>();
        this.arestasSaida = new ArrayList<>();
    }

    public Tipo getDado() {
        return dado;
    }
    public void setDado(Tipo dado) {
        this.dado = dado;
    }
    public ArrayList<Arresta<Tipo>> getArestasEntrada() {
        return arestasEntrada;
    }
    public ArrayList<Arresta<Tipo>> getArestasSaida() {
        return arestasSaida;
    }
    public void setArestasEntrada(ArrayList<Arresta<Tipo>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }
    public void setArestasSaida(ArrayList<Arresta<Tipo>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }
    public void adicionarArestaEntrada(Arresta<Tipo> aresta) {
        this.arestasEntrada.add(aresta);
    }
    public void adicionarArestaSaida(Arresta<Tipo> aresta) {
        this.arestasSaida.add(aresta);
    }
}
