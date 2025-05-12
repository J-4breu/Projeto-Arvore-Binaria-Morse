import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
        arvore.inicializar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma mensagem em código Morse (letras separadas por espaço):");
        String entrada = scanner.nextLine();

        String traduzida = arvore.traduzirFrase(entrada);
        System.out.println("Mensagem traduzida: " + traduzida);

        System.out.println("\nExibição da árvore Morse:");
        arvore.exibir();

        scanner.close();
    }
}
