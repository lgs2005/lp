public class Uni5Exe21 {
    public static void main(String[] args) {
        double alturaChico = 1.50;
        double crescimentoChico = 0.02;

        double alturaZe = 1.10;
        double crescimentoZe = 0.03;

        int anosTotal = 0;

        while (alturaChico >= alturaZe) {
            alturaChico += crescimentoChico;
            alturaZe += crescimentoZe;
            anosTotal += 1;
        }

        System.out.println(anosTotal + " anos.");
    }
}
