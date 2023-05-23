import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatoReais = new DecimalFormat("R$ 0.00");

        int contasEncerradas = 0;
        
        boolean fim = false;
        while (!fim) {
            System.out.println("");
            System.out.println("(1) encerrar a conta de um hóspede");
            System.out.println("(2) verificar número de contas encerradas");
            System.err.println("(3) sair");

            int codigo = -1;
            do {
                int entrada = scanner.nextInt();
                if (entrada < 1 || entrada > 3) {
                    System.out.println("Opçao incorreta.");
                } else {
                    codigo = entrada;
                }
            } while (codigo == -1);

            if (codigo == 1) {
                System.out.print("Nome do hóspede: ");
                String nome = scanner.next();
                System.out.print("Número de diárias: ");
                int diarias = scanner.nextInt();

                double valor;
                if (diarias < 15) {
                    valor = diarias * 7.50;
                } else if (diarias == 15) {
                    valor = diarias * 6.50;
                } else {
                    valor = diarias * 5.00;
                }

                System.out.println("====================");
                System.out.println("Nome do hóspede: " + nome);
                System.out.println("Valor a pagar: " + formatoReais.format(valor));
                contasEncerradas++;
            } else if (codigo == 2) {
                System.out.println("Total de contas encerradas: " + contasEncerradas);
            } else if (codigo == 3) {
                fim = true;
            }
        }

        scanner.close();
    }
}
