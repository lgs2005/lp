import java.text.DecimalFormat;
import java.util.Scanner;

public class lucas_gabriel_sievert_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        String codigoHotel = scanner.next().toLowerCase();
        double precoInicial = scanner.nextDouble();

        String nomeHotel = "";
        double desconto = 0;
        
        switch (codigoHotel) {
            case "a":
                if (precoInicial > 500) {
                    System.out.println("O preço de entrada para o 123Milhas não pode ser superior a R$500,00");
                } else {
                    nomeHotel = "123Milhas";
                    desconto = 0.15;
                }
                break;
            case "b":
                if (precoInicial > 600) {
                    System.out.println("O preço de entrada para o MaxMilhas não pode ser superior a R$600,00");
                } else {
                    nomeHotel = "MaxMilhas";
                    desconto = 0.15;
                }
                break;
            case "c":
                if (precoInicial > 1500) {
                    System.out.println("O preço de entrada para o Azul Viagens não pode ser superior a R$1500,00");
                } else {
                    nomeHotel = "Azul Viagens";
                    desconto = 0.20;
                }
                break;
            case "d":
                if (precoInicial < 300 || precoInicial > 2000) {
                    System.out.println("O preço de entrada para o Gol Viagens deve ser entre R$300,00 e R$2000,00");
                } else {
                    nomeHotel = "Gol Viagens";
                    desconto = 0.30;
                }
                break;
            case "e":
                if (precoInicial < 300 || precoInicial > 2000) {
                    System.out.println("O preço de entrada para o Latam Travel deve ser entre R$300,00 e R$2000,00");
                } else {
                    nomeHotel = "Latam Travel";
                    desconto = 0.40;
                }
                break;
            case "f":
                nomeHotel = "Outros";
                desconto = 0;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }

        if (!nomeHotel.isEmpty()) {
            double valorDesconto = precoInicial * desconto;
            double precoFinal = precoInicial - valorDesconto;

            System.out.println("Hotel: " + nomeHotel);
            System.out.println("Desconto: " + format.format(valorDesconto));
            System.out.println("Preço total: " + format.format(precoFinal));
        }

        scanner.close();
    }
}
