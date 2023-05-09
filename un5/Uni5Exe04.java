public class Uni5Exe04 {
    public static void main(String[] args) {
        double soma = 0;
        double x = 1;
        double y = 0;

        for (int i = 0; i < 20; i++) {
            y += x+1;
            x += 2;
            //System.out.println("" + x + " / " + y);
            soma += x/y;
        }

        System.out.println("S = " + soma);
    }
}
