import java.util.Scanner;

public class SumOfConsecutiveOddNumbersI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int odd = 0;

        if (x>y){
            for (int i = y+1; i < x; i++) {
                if (i % 2 != 0){
                    odd += i;
                }
            }
        }else {
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0){
                    odd += i;
                }
            }
        }
        System.out.println(odd);
    }
}
