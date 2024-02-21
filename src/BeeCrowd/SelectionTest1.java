package BeeCrowd;

import java.util.Scanner;

public class SelectionTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A,B,C,D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        if (B>C && D>A && (D+C)> (A+B) && D>0 && C>0 && A % 2== 0){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }

    }


}
