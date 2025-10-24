
import java.util.ArrayList;
import java.util.Objects;

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

    /**
     * Dois Vértices são considerados iguais se eles contiverem o mesmo dado (Musica).
     * Isso é CRUCIAL para listas e buscas dentro do Grafo.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice<?> vertice = (Vertice<?>) o;
        // A igualdade do Vértice depende da igualdade do DADO (Musica)
        return Objects.equals(dado, vertice.dado); 
    }

    /**
     * Gera um código hash consistente baseado no dado (Musica) que ele contém.
     */
    @Override
    public int hashCode() {
        return Objects.hash(dado);
    }
}
