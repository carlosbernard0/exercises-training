package BeeCrowd;

import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary, newSalary, moneyEarned, porcentage;


        salary = input.nextDouble();

        if (salary <= 400.00){
            porcentage = .15;
            moneyEarned = salary * porcentage;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.printf("Em percentual: %.0f %%%n", porcentage*100);
        } else if (salary > 400.00 && salary <= 800.00) {
            porcentage = .12;
            moneyEarned = salary * porcentage;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.printf("Em percentual: %.0f %%%n", porcentage*100);
        } else if (salary > 800.00 && salary <= 1200.00) {
            porcentage = .1;
            moneyEarned = salary * porcentage;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.printf("Em percentual: %.0f %%%n", porcentage*100);
        } else if (salary> 1200.00 && salary <= 2000.00) {
            porcentage = .07;
            moneyEarned = salary * porcentage;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.printf("Em percentual: %.0f %%%n", porcentage*100);
        } else {
            porcentage = .04;
            moneyEarned = salary * porcentage;
            newSalary = salary + moneyEarned;
            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
            System.out.printf("Em percentual: %.0f %%%n", porcentage*100);
        }
    }
}
