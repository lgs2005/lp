import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalLucroMax10 = 0;
        int totalLucroMax20 = 0;
        int totalLucroMaxP = 0;

        double precoCompraTotal = 0;
        double precoVendaTotal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Mercadoria " + i);

            System.out.print("Nome: ");
            scanner.next();

            System.out.print("Preço de compra (PC): ");
            double precoCompra = scanner.nextDouble();
            
            System.out.print("Preço de venda (PV): ");
            double precoVenda = scanner.nextDouble();

            precoCompraTotal += precoCompra;
            precoVendaTotal += precoVenda;

            double lucro = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucro < 10) {
                totalLucroMax10++;
            } else if (lucro < 20) {
                totalLucroMax20++;               
            } else {
                totalLucroMaxP++;
            }
        }

        double lucroTotal = ((precoVendaTotal - precoCompraTotal) / precoCompraTotal) * 100;
        DecimalFormat formatPreco = new DecimalFormat("R$ 0.00");
        DecimalFormat formatLucro = new DecimalFormat("0.00%");

        System.out.println("Total de mercadorias com lucro menor de 10%: " + totalLucroMax10);
        System.out.println("Total de mercadorias com lucro maior de 10% e menor de 20%: " + totalLucroMax20);
        System.out.println("Total de mercadorias com lucro maior de 20%: " + totalLucroMaxP);
        System.out.println("PC total: " + formatPreco.format(precoCompraTotal));
        System.out.println("PV total: " + formatPreco.format(precoVendaTotal));
        System.out.println("Lucro total: " + formatLucro.format(lucroTotal));
        scanner.close();
    }
}
