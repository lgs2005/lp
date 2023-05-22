import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pontosEsquerda = 0;
        int pontosDireita = 0;

        while ((pontosEsquerda < 21 || pontosEsquerda-pontosDireita < 2) && (pontosDireita < 21 || pontosDireita-pontosEsquerda < 2)) {
            char codigoPonto = scanner.next().toLowerCase().charAt(0);

            if (codigoPonto == 'd') {
                pontosDireita += 1;
            } else if (codigoPonto == 'e') {
                pontosEsquerda += 1;
            } else {
                System.out.println("Código não reconhecido.");
            }

            System.out.println("Esquerda: " + pontosEsquerda);
            System.out.println("Direita: " + pontosDireita);
        }

        String vencedor;
        if (pontosEsquerda > pontosDireita) {
            vencedor = "esquerda";
        } else {
            vencedor = "direita";
        }

        System.out.println("Vence o jogador da " + vencedor);

        scanner.close();
    }
}
