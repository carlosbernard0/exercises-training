package BeeCrowd;

public class SSequenceII {
    public static void main(String[] args) {
        // S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

        double aux= 1;
        double result = 0;
        for (double i = 1; i <=39 ; i+=2) {
            result += i/aux;
            aux*=2;
        }

        System.out.printf("%.2f%n",result);
    }
}
