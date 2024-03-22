package BeeCrowd;

import java.util.Scanner;

public class MultiplesOf13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y, sumOfAll;
        x = input.nextInt();
        y = input.nextInt();
        sumOfAll = 0;

        if (x<y){
            for (int i = x; i <= y ; i++) {
                if (i % 13 != 0){
                    sumOfAll += i;
                }
            }
        } else {
            for (int i = y; i <= x ; i++) {
                if (i % 13 != 0){
                    sumOfAll += i;
                }
            }
        }



        System.out.println(sumOfAll);
    }
}
