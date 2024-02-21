package BeeCrowd;

import java.util.Scanner;

public class SixOddNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num = input.nextInt();
        if (num%2==1){
            System.out.println(num);
            System.out.println(num+2);
            System.out.println(num+4);
            System.out.println(num+6);
            System.out.println(num+8);
            System.out.println(num+10);

        }
        if (num%2==0){
            System.out.println(num+1);
            System.out.println(num+3);
            System.out.println(num+5);
            System.out.println(num+7);
            System.out.println(num+9);
            System.out.println(num+11);
        }


    }
}
