import java.util.Scanner;

public class Interval2  {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int N = input.nextInt();

        int in, out;
        in = 0;
        out = 0;

        for (int i = 0; i < N; i++) {
            int number = input.nextInt();
            if (number <= 20 && number >= 10){
                in++;
            }else {
                out++;
            }
        }
        System.out.printf("%d in%n",in);
        System.out.printf("%d in%n",in);
        System.out.printf("%d out%n",out);

    }
}
