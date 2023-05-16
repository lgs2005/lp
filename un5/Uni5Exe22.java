import java.text.DecimalFormat;

public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000;
        double aumento = salario * 0.015;
        int ano = 1996;
        
        while (ano <= 2023) {
            salario += aumento;
            aumento *= 2;
            ano += 1;
        }

        DecimalFormat format = new DecimalFormat("R$ 0.00");
        System.out.println("Salário autual: " + format.format(salario));
    }
}
