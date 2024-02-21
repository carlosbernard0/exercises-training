package BeeCrowd;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int A,B,C;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

        int biggerAB = (A+B+(Math.abs(A-B)))/2;
        int biggerABC = (C+biggerAB+(Math.abs(C-biggerAB)))/2;

        System.out.println(biggerABC+ " eh o maior");
    }
}
