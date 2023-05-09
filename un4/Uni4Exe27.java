import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("R$ 0.00");
    
        System.out.print("Horário de Entrada: ");
        int horaEntrada = scanner.nextInt();
        int minutoEntrada = scanner.nextInt();

        System.out.print("Horário de Saída: ");
        int horaSaida = scanner.nextInt();
        int minutoSaida = scanner.nextInt();

        if (horaEntrada < 0 || horaEntrada >= 24 || minutoEntrada < 0 || minutoEntrada >= 60 || horaSaida < 0 || horaSaida >= 24 || minutoSaida < 0 || minutoSaida >= 60) {
            System.out.println("Horários inválido.");
        } else if (horaSaida < horaEntrada || (horaSaida == horaEntrada && minutoSaida < minutoEntrada)) {
            System.out.println("Não se pode sair antes de entrar.");
        } else {
            int minutosTotal = (horaSaida - horaEntrada)*60 + minutoSaida - minutoEntrada;
            long horas = Math.round(minutosTotal / 60.0);
            double valor;

            if (horas == 0) {
                horas = 1;
            }

            if (horas <= 2) {
                valor = horas * 5.00;
            }
            else if (horas <= 4) {
                valor = horas * 7.50;
            }
            else {
                valor = horas * 10.00;
            }

            System.out.println("Horas: " + horas);
            System.out.println("Valor: " + format.format(valor));
        }

        scanner.close();
    }
}
