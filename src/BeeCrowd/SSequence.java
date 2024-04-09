package BeeCrowd;


public class SSequence {
    public static void main(String[] args) {

        double S = 0;
        int aux = 1;
        for (int i = 1; i <= 100; i++) {
            S += (double) aux /i;
        }

        System.out.printf("%.2f%n",S);

    }
}
