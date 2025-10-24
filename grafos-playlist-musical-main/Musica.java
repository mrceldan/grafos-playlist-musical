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

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", duracao='" + duracao + '\'' +
                '}';
    }
}
