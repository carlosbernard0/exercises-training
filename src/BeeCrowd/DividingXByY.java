package BeeCrowd;

import java.util.Scanner;

public class DividingXByY {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String nums = input.nextLine();
            String[] num = nums.split(" ");
            double x = Double.parseDouble(num[0]);
            double y = Double.parseDouble(num[1]);

            double divisao = x/y;
            if (y == 0 ) {
                System.out.println("divisao impossivel");
            }else{
                System.out.println(divisao);
            }
        }
    }
}
