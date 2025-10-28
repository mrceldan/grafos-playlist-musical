import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        int opcao;
        do {
            System.out.println("---------------SINTONIZA---------------");
            System.out.println("1. Próxima Música");
            System.out.println("2. Música Anterior");
            System.out.println("3. Ordem Aleatória");
            System.out.println("4. Sugerir Músicas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println(playlist.proximaMusica());
                        break;
                    case 2:
                        System.out.println(playlist.anteriorMusica());
                        break;
                    case 3:
                        System.out.println(playlist.ordemAleatoria());
                        break;
                    case 4:
                        List<String> sugestoes = playlist.sugerirMusicas();
                        if (sugestoes.isEmpty()) {
                            System.out.println("Nenhuma sugestão encontrada a partir desta faixa.");
                        } else {
                            System.out.println("Músicas sugeridas: " + sugestoes);
                        }
                        break;
                    case 0:
                        System.out.println("Saindo da Playlist...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
                opcao = -1;
            }

        } while (opcao != 0);

        scanner.close();
    }
}