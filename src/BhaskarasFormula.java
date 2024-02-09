import java.util.Scanner;

public class BhaskarasFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A,B,C;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double delta = Math.pow(B,2) - (4*A*C);
        double R1 = ((-B+(Math.sqrt(delta))))/(2*A);
        double R2 = ((-B-(Math.sqrt(delta))))/(2*A);

       if (delta > 0 && A != 0){
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
       }else {
           System.out.println("Impossivel calcular");
       }
    }
}
