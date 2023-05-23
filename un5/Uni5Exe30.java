import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.print("K = ");
        int k = scanner.nextInt();
        System.out.print("M = ");
        int m = scanner.nextInt();

        String elementosTodos = "";
        String elementosEntraram = "";
        String elementosDeFora = "";

        int somaEntraram = 0;
        int somaDeFora = 0;

        for (int i = n; i > 0; i -= k) {
            elementosTodos += i + " ";

            if (i <= (m-somaEntraram)) {
                somaEntraram += i;
                elementosEntraram += i + " ";
            } else {
                somaDeFora += i;
                elementosDeFora += i + " ";
            }
        }

        System.out.println("Elementos a serem colocados: " + elementosTodos);
        System.out.println("Elementos que entraram: " + elementosEntraram);
        System.out.println("Elementos que ficaram de fora: " + elementosDeFora);
        System.out.println("Soma dos elementos que entraram: " + somaEntraram);
        System.out.println("Soma dos elementos que não entraram: " + somaDeFora);

        scanner.close();
    }
}
