package BeeCrowd;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int bankNotes100 = num /100; //5.76
        int bankNotes50 = (num -(bankNotes100*100)) /50; //1.52
        int bankNotes20 = (num -((bankNotes50*50)+(bankNotes100*100))) /20;
        int bankNotes10 = (num -((bankNotes50*50)+(bankNotes100*100)+(bankNotes20*20))) /10;
        int bankNotes5 = ((num -((bankNotes50*50)+(bankNotes100*100)+(bankNotes20*20)+(bankNotes10*10)))) /5;
        int bankNotes2 = ((num -((bankNotes50*50)+(bankNotes100*100)+(bankNotes20*20)+(bankNotes10*10)+(bankNotes5*5)))) /2;
        int bankNotes1 = ((num -((bankNotes50*50)+(bankNotes100*100)+(bankNotes20*20)+(bankNotes10*10)+(bankNotes5*5)+(bankNotes2*2)))) /1;

        System.out.println(num);
        System.out.printf("%d nota(s) de R$ 100,00%n", bankNotes100);
        System.out.printf("%d nota(s) de R$ 50,00%n", bankNotes50);
        System.out.printf("%d nota(s) de R$ 20,00%n", bankNotes20);
        System.out.printf("%d nota(s) de R$ 10,00%n",bankNotes10);
        System.out.printf("%d nota(s) de R$ 5,00%n",bankNotes5);
        System.out.printf("%d nota(s) de R$ 2,00%n",bankNotes2);
        System.out.printf("%d nota(s) de R$ 1,00%n", bankNotes1);
    }
}
