import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] memoria = new int[50];
        int ponteiro = 0;

        boolean sair = false;

        while (!sair) {
            System.out.println("");
            System.out.println("MENU:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ponteiro = acaoIncluirValor(scanner, memoria, ponteiro);
                    break;
                case 2:
                    acaoPesquisarValor(scanner, memoria, ponteiro);
                    break;
                case 3:
                    acaoAlterarValor(scanner, memoria, ponteiro);
                    break;
                case 4:
                    ponteiro = acaoExcluirValor(scanner, memoria, ponteiro);
                    break;
                case 5:
                    acaoMostrarValores(memoria, ponteiro);
                    break;
                case 6:
                    acaoOrdernarValores(memoria, ponteiro);
                    break;
                case 7:
                    acaoInverterValores(memoria, ponteiro);
                    break;
                case 8:
                    System.out.println("Até mais!");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }

    public static int lerValor(Scanner scanner) {
        System.out.print("Digite o valor: ");
        int valor = scanner.nextInt();
        return valor;
    }

    public static int encontrarValor(int[] memoria, int pointeiro, int valor) {
        for (int i = 0; i < pointeiro; i++) {
            if (memoria[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int acaoIncluirValor(Scanner scanner, int[] memoria, int ponteiro) {
        if (ponteiro == 49) {
            System.out.println("Limite de valores alcançado.");
        } else {
            memoria[ponteiro] = lerValor(scanner);
            ponteiro += 1;
        }

        return ponteiro;
    }

    public static void acaoPesquisarValor(Scanner scanner, int[] memoria, int ponteiro) {
        int valor = lerValor(scanner);
        int index = encontrarValor(memoria, ponteiro, valor);

        if (index < 0) {
            System.out.println("Valor não encontrado.");
        } else {
            System.out.println("Valor encontrado.");
        }
    }

    public static void acaoAlterarValor(Scanner scanner, int[] memoria, int ponteiro) {
        System.out.println("Valor para ser alterado =");
        int alterar = lerValor(scanner);

        System.out.println("Novo valor =");
        int novo = lerValor(scanner);

        int index = encontrarValor(memoria, ponteiro, alterar);

        if (index < 0) {
            System.out.println("Valor não encontrado.");
        } else {
            memoria[index] = novo;
            System.out.println("Valor alterado.");
        }
    }

    public static int acaoExcluirValor(Scanner scanner, int[] memoria, int ponteiro) {
        int valor = lerValor(scanner);
        int index = encontrarValor(memoria, ponteiro, valor);

        if (index < 0) {
            System.out.println("Valor não encontrado.");
        } else {
            ponteiro -= 1;
            for (int i = index; i < ponteiro; i++) {
                memoria[i] = memoria[i+1];
            }

            memoria[ponteiro] = 0;
            System.out.println("Valor removido.");
        }

        return ponteiro;
    }

    public static void acaoMostrarValores(int[] memoria, int ponteiro) {
        String resultado = "[" + memoria[0];
        for (int i = 1; i < ponteiro; i++) {
            resultado += ", " + memoria[i];
        }
        resultado += "]";
        System.out.println(resultado);
    }

    public static void acaoOrdernarValores(int[] memoria, int ponteiro) {
        for (int i = 0; i < ponteiro; i++) {
            for (int i2 = 0; i2 < ponteiro-i-1; i2++) {
                if (memoria[i2] > memoria[i2+1]) {
                    int temp = memoria[i2];
                    memoria[i2] = memoria[i2+1];
                    memoria[i2+1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados.");
    }

    public static void acaoInverterValores(int[] memoria, int ponteiro) {
        int[] memoriaTemp = new int[ponteiro];
        for (int i = 0; i < ponteiro; i++) {
            memoriaTemp[i] = memoria[ponteiro-i-1];
        }
        for (int i = 0; i < ponteiro; i++) {
            memoria[i] = memoriaTemp[i];
        }
        System.out.println("Valores invertidos.");
    }
}
