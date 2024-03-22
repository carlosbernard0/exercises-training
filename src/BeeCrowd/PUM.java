package BeeCrowd;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int iAux1 = 1;
        int iAux2 = 2;
        int iAux3 = 3;
        for (int j = 0; j < N; j++) {
            for (int i = 1; i <= 4; i++) {
                if (i==4){
                    System.out.println("PUM");
                }else if (i==1){
                    System.out.printf("%d ",iAux1);
                    iAux1 += 4;

                } else if (i==2) {
                    System.out.printf("%d ",iAux2);
                    iAux2 += 4;

                } else if (i == 3) {
                    System.out.printf("%d ",iAux3);
                    iAux3 += 4;
                }
            }
        }
    }
}
