import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatKG = new DecimalFormat("0.00Kg");

        System.out.print("Limite diário de pesca (Kg): ");
        double limiteDiario = scanner.nextDouble();

        double pesoTotal = 0;
        boolean fim = false;

        while (!fim) {
            System.out.println("Deseja informar o peso de mais um peixe? s (SIM) / n (NAO)");
            char resposta = scanner.next().toLowerCase().charAt(0);

            if (!(resposta == 's')) {
                fim = true;
            } else {
                System.out.print("Peso do peixe (g): ");
                double pesoPeixe = scanner.nextDouble();

                pesoTotal += pesoPeixe/1000;
                System.out.println("Peso total: " + formatKG.format(pesoTotal));

                if (pesoTotal >= limiteDiario) {
                    System.out.println("Limite diário excedido.");
                    fim = true;
                }
            }
        }

        scanner.close();
    }
}
