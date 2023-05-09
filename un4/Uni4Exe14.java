import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = scanner.nextInt();

        System.out.print("Mês: ");
        int mes = scanner.nextInt();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        boolean dataValida = false;

        if (ano > 0 && mes > 0 && mes <= 12 && dia > 0) {
            if (mes == 2) {
                if (ano % 4 == 0 && ano % 100 != 0 && ano % 400 != 0) {
                    dataValida = dia <= 29;
                } else {
                    dataValida = dia <= 28;
                }
            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                dataValida = dia <= 31;
            } else {
                dataValida = dia <= 30;
            }
        }

        if (dataValida) {
            System.out.println("Válida");
        } else {
            System.out.println("Inválida");
        }

        scanner.close();
    }
}
