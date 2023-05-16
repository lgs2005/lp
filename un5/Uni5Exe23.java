import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatReais = new DecimalFormat("R$ 0.00");

        boolean fim = false;
        String relatorio = "";

        while (!fim) {
            System.out.print("Nome do vendedor: ");
            String nome = scanner.next();

            System.out.print("Número de produtos: ");            
            int numProdutos = scanner.nextInt();

            double totalVendas = 0;

            for (int i = 0; i < numProdutos; i++) {
                System.out.println("Produto " + i);

                System.out.print("Preço unitário: ");
                double precoProduto = scanner.nextDouble();

                System.out.print("Quantidade vendido: ");
                int qtdeProduto = scanner.nextInt();

                totalVendas += precoProduto * qtdeProduto;
            }

            double salario = totalVendas * 0.30;

            relatorio += "\n======================";
            relatorio += "\nVendedor: " + nome;
            relatorio += "\nTotal de vendas: " + formatReais.format(totalVendas);
            relatorio += "\nSalário: " + formatReais.format(salario);

            System.out.println("Deseja digitar os dados de mais um vendedor? s (SIM) / n (NAO)");
            char resposta = scanner.next().toLowerCase().charAt(0);

            if (!(resposta == 's')) {
                fim = true;
            }
        }

        relatorio += "\n======================";
        System.out.println(relatorio);
        scanner.close();
    }
}
