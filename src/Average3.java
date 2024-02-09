import java.util.Scanner;

public class Average3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,num2,num3,num4,examScore, average;

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        num4 = input.nextDouble();
        examScore = input.nextDouble();

        average = (num1 + num2 + num3+ num4)/4;

        if (average >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (average < 5) {
            System.out.println("Aluno reprovado.");
        }else {
            System.out.println("Aluno em exame.");
            examScore = input.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", examScore);
            if (examScore >= 5){
                System.out.println("Aluno aprovado.");
            } else if (examScore < 5) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", (examScore+average)/2);
        }
        input.close();
    }
}
