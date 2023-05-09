public class Uni5Exe10 {
    public static void main(String[] args) {
        int numerosEncontrados = 0;

        for (int i = 10; numerosEncontrados < 10; i++) {
            for (int n = 10; n <= i && numerosEncontrados < 10; n *= 10) {
                int y = i % n;
                int x = (i - y) / n;
                int s = x + y;

                if (s*s == i) {
                    System.out.println(x + " + " + y + " = " + s + " -> " + s + "*" + s + " = " + i);
                    numerosEncontrados += 1;
                }
            }
        }

        // Usando apenas três digitos
        // Apenas encontra três soluções
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
