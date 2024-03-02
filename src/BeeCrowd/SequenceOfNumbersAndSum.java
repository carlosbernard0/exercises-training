package BeeCrowd;

import java.util.Scanner;

public class SequenceOfNumbersAndSum {
    public static void main(String[] args) {
        int M,N;
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while (((M = input.nextInt()) > 0 )&&((N = input.nextInt()) > 0 )){
            if (M>N){
                for (int i = N; i <= M ; i++) {
                    sum+=i;
                    System.out.printf("%d ", i);
                }
                System.out.printf("Sum=%d%n", sum);
            }else {
                for (int i = M; i <= N ; i++) {
                    sum+=i;
                    System.out.printf("%d ", i);
                }
                System.out.printf("Sum=%d%n", sum);
            }


            sum = 0;

        }
    }
}
