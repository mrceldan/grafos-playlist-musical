
import java.util.Objects;

public class Musica {
    private String nome;
    private String artista;
    private String duracao;

    public String getMusica() {
        return nome;
    }

    public void setMusica(String musica) {
        this.nome = musica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    /**
     * Define quando duas instâncias de Musica são consideradas idênticas.
     * O Grafo usa este método para verificar se o Vértice que ele busca já existe.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        
        // Critério de Igualdade: Duas músicas são iguais se tiverem o mesmo nome E artista.
        // Se você tivesse um ID único, usaria apenas o ID.
        return Objects.equals(nome, musica.nome) &&
               Objects.equals(artista, musica.artista);
    }

    /**
     * Gera um código hash consistente. 
     * Essencial para garantir que equals e hashCode sejam consistentes.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, artista);
    }

    @Override
    public String toString() {
        return nome + " - " + artista; // Formato mais limpo para exibição.
    }
}



   