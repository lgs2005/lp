import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: ");
        double valorMaximo = scanner.nextDouble();

        int trechosNaoAceitos = 0;
        int trechosTotal = 0;
        int trechos150kmOuMais = 0;
        boolean fim = false;

        System.out.println("Digite os valores the cada trecho, use um valor negativo em Pedágio para terminar.");
        while (!fim) {
            System.out.println("Trecho");
            System.out.print("Pedágio: ");
            double valor = scanner.nextDouble();

            if (valor < 0) {
                fim = true;  
            } else {
                System.out.print("Distância (KM): ");
                double distancia = scanner.nextDouble();

                trechosTotal += 1;

                if (valor > valorMaximo) {
                    trechosNaoAceitos += 1;
                } else if (distancia > 150) {
                    trechos150kmOuMais += 1;
                }
            }
        }

        System.out.println(trechosNaoAceitos + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(trechosTotal + " (quantidade de trechos informados)");
        System.out.println(trechos150kmOuMais + " (trechos acima de 150km com valor aceito por ele)");

        scanner.close();
    }
}
