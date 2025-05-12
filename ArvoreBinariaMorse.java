public class ArvoreBinariaMorse {
    private Nodo raiz;

    public void inicializar() {
        raiz = new Nodo(' ');
        inserirAutomaticamente();
    }

    public void inserir(String codigoMorse, char caractere) {
        Nodo atual = raiz;
        int i = 0;
        while (i < codigoMorse.length()) {
            char simbolo = codigoMorse.charAt(i);
            if (simbolo == '.') {
                if (atual.esquerda == null) {
                    atual.esquerda = new Nodo(' ');
                }
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                if (atual.direita == null) {
                    atual.direita = new Nodo(' ');
                }
                atual = atual.direita;
            }
            i++;
        }
        atual.caractere = caractere;
    }

    public char buscar(String codigoMorse) {
        Nodo atual = raiz;
        int i = 0;
        while (i < codigoMorse.length()) {
            char simbolo = codigoMorse.charAt(i);
            if (simbolo == '.') {
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                atual = atual.direita;
            }
            if (atual == null) {
                return '?';
            }
            i++;
        }
        return atual.caractere;
    }

    public String traduzirFrase(String fraseMorse) {
        String resultado = "";
        int i = 0;
        while (i < fraseMorse.length()) {
            String codigo = "";
            while (i < fraseMorse.length() && fraseMorse.charAt(i) != ' ') {
                codigo = codigo + fraseMorse.charAt(i);
                i++;
            }
            resultado = resultado + buscar(codigo);
            while (i < fraseMorse.length() && fraseMorse.charAt(i) == ' ') {
                i++;
            }
        }
        return resultado;
    }

    public void exibir() {
        exibirRec(raiz, 0, "");
    }

    private void exibirRec(Nodo nodo, int nivel, String caminho) {

        if (nodo == null) return;

        int i = 0;

        while (i < nivel) {
            System.out.print("   ");
            i++;
        }

        // Mostra o caminho (.|-), depois o caractere
        System.out.println("|" + caminho + " " + nodo.caractere);

        exibirRec(nodo.esquerda, nivel + 1, caminho + ".");
        exibirRec(nodo.direita, nivel + 1, caminho + "-");
    }

    private void inserirAutomaticamente() {
        inserir(".-", 'A');
        inserir("-...", 'B');
        inserir("-.-.", 'C');
        inserir("-..", 'D');
        inserir(".", 'E');
        inserir("..-.", 'F');
        inserir("--.", 'G');
        inserir("....", 'H');
        inserir("..", 'I');
        inserir(".---", 'J');
        inserir("-.-", 'K');
        inserir(".-..", 'L');
        inserir("--", 'M');
        inserir("-.", 'N');
        inserir("---", 'O');
        inserir(".--.", 'P');
        inserir("--.-", 'Q');
        inserir(".-.", 'R');
        inserir("...", 'S');
        inserir("-", 'T');
        inserir("..-", 'U');
        inserir("...-", 'V');
        inserir(".--", 'W');
        inserir("-..-", 'X');
        inserir("-.--", 'Y');
        inserir("--..", 'Z');

        inserir("-----", '0');
        inserir(".----", '1');
        inserir("..---", '2');
        inserir("...--", '3');
        inserir("....-", '4');
        inserir(".....", '5');
        inserir("-....", '6');
        inserir("--...", '7');
        inserir("---..", '8');
        inserir("----.", '9');
    }
}
