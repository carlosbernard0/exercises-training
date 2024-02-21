package BeeCrowd;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salary = input.nextFloat();
        float value = 0;



        if (salary > 0 && salary <= 2000){
            System.out.println("Isento");
        } else if (salary > 2000 && salary <= 3000) {
            value = (salary - 2000) * .08f;
            System.out.printf("R$ %.2f%n", value );
        } else if (salary > 3000 && salary <= 4500) {
            value = ((salary - 3000)*.18f)+80;
            System.out.printf("R$ %.2f%n", value );
        }else if(salary < 4500){
            value = ((salary - 4500)*.28f)+80+270;
            System.out.printf("R$ %.2f%n", value);
        }
    }
}
