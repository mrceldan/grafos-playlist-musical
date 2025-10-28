import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Playlist {
    private Grafo<String> grafo;
    private List<String> musicas;
    private int indiceAtual;

    public Playlist() {
        this.grafo = new Grafo<>();
        this.musicas = new ArrayList<>();
        this.indiceAtual = -1;
        inicializarPlaylist();
    }

    private void inicializarPlaylist() {
        this.musicas.add("Ai Se Eu Te Pego!");
        this.musicas.add("Camisa 10");
        this.musicas.add("Baile da Colômbia");
        this.musicas.add("Mania de Você");
        this.musicas.add("Jesus Chorou");
        this.musicas.add("Nave Espacial");

        for(String musica : this.musicas) {
            grafo.adicionarVertice(musica);
        }

        grafo.adicionarAresta(2.0, "Ai Se Eu Te Pego!", "Camisa 10");
        grafo.adicionarAresta(2.0, "Baile da Colômbia", "Mania de Você");
        grafo.adicionarAresta(2.0, "Jesus Chorou", "Nave Espacial");
        grafo.adicionarAresta(1.0, "Nave Espacial", "Ai Se Eu Te Pego!");

    }

    public String proximaMusica() {
        if (musicas.isEmpty()) return "Playlist vazia.";
        indiceAtual = (indiceAtual + 1) % musicas.size();
        return "Tocando próxima: " + musicas.get(indiceAtual);
    }

    public String anteriorMusica() {
        if (musicas.isEmpty()) return "Playlist vazia.";
        indiceAtual = (indiceAtual - 1 + musicas.size()) % musicas.size();
        return "Tocando anterior: " + musicas.get(indiceAtual);
    }

    public String ordemAleatoria() {
        if (musicas.isEmpty()) return "Playlist vazia.";
        Random rand = new Random();
        int novoIndice;
        do {
            novoIndice = rand.nextInt(musicas.size());
        } while (novoIndice == indiceAtual && musicas.size() > 1);

        indiceAtual = novoIndice;
        return "Tocando aleatoriamente: " + musicas.get(indiceAtual);
    }

    public List<String> sugerirMusicas() {
        if (indiceAtual == -1) {
            return Collections.emptyList();
        }
        String musicaAtual = musicas.get(indiceAtual);

        System.out.println("Partindo de: " + musicaAtual + " :");

        ArrayList<String> sugestoes = grafo.buscaEmLargura(musicaAtual);

        return sugestoes;
    }

}