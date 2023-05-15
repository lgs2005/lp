public class Uni5Exe10 {
    public static void main(String[] args) {
        int numerosEncontrados = 0;
        int maxNumeros = 10;
        
        // um while seria melhor pra resolver isso aq, mas como o exercicio esta na seção de for...
        // contando até o infinito enquanto menos de 10 numeros encontrados
        for (int num = 10; numerosEncontrados < maxNumeros; num++) {
            // para cada numero, conta em potencias de 10 até a potencia ser maior que o numero
            // n=10, n=100, n=1000, n=10000
            for (int potencia = 10; potencia <= num && numerosEncontrados < maxNumeros; potencia *= 10) {
                // divide o numero usando a potencia
                int esquerda = num % potencia;
                int direita = (num - esquerda) / potencia;
                int valor = esquerda + direita;

                if (valor*valor == num) {
                    System.out.println(direita + " + " + esquerda + " = " + valor + " -> " + valor + "*" + valor + " = " + num);
                    numerosEncontrados += 1;
                }
            }
        }

        // 2025
        // 3025
        // 9001
        // Phenomenal.

        // for (int i = 100; numerosEncontrados < 10; i++) {
        //     int y = i % 100;
        //     int x = (i - y)/100;
        //     int s = x+y;
            
        //     if (s*s == i) {
        //         numerosEncontrados += 1;
        //         System.out.println(i);
        //     }
        // }
    }
}
