import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Início da semana: ");
        int semanaInicio = scanner.nextInt();
        System.out.print("Dias no mês: ");
        int diasNoMes = scanner.nextInt();

        int proximoDia = 1;
        int proximoDiaSemana = semanaInicio;
        String calendario = "D\tS\tT\tQ\tQ\tS\tS\n";

        if (proximoDiaSemana > 7) {
            System.out.println("Dia da semana muito grande. Iniciando na Segunda.");
            proximoDiaSemana = 1;
        }

        for (int i = 1; i < semanaInicio; i++) {
            calendario += "\t";
        }

        while (proximoDia <= diasNoMes) {
            calendario += proximoDia + "\t";
            proximoDia++;
            proximoDiaSemana++;
            if (proximoDiaSemana > 7) {
                proximoDiaSemana = 1;
                calendario += '\n';
            }
        }

        System.out.println(calendario);
        scanner.close();
    }
}
