package BeeCrowd;

import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A,B,C,maior;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        if(A < B){
            maior=A;
            A = B;
            B = maior;
        }

        if(A < C){
            maior = A;
            A = C;
            C = maior;
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

            if (A >= B+C){
                System.out.println("NAO FORMA TRIANGULO");
            }else {
                if (Math.pow(A,2) == ((Math.pow(B,2))+ (Math.pow(C,2))) ) {
                    System.out.println("TRIANGULO RETANGULO");
                }
                if (Math.pow(A,2) > ((Math.pow(B,2))+ (Math.pow(C,2))) ){
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
                if (Math.pow(A,2) < ((Math.pow(B,2))+ (Math.pow(C,2))) ){
                    System.out.println("TRIANGULO ACUTANGULO");
                }
                if (A == C && A == B && C == B) {
                    System.out.println("TRIANGULO EQUILATERO");
                }
                if ((A == B && A!= C && B != C)||(A == C && A!= B && B != C)||(C == B && A!= C && B != A)) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }

        }
    }

