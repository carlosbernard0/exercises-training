package BeeCrowd;

import java.util.Scanner;

public class Experiments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numExperiments= input.nextInt();
        input.nextLine();
        int rabbits = 0;
        int rats = 0;
        int frogs = 0;

        int allAnimals = 0;

        for (int i = 0; i < numExperiments; i++) {
            String amoutAndType = input.nextLine();
            String[] list = amoutAndType.split(" ");
            int amout = Integer.parseInt(list[0]);
            String type = list[1];
            if (amout >0 && amout < 16){
                if (type.equalsIgnoreCase("C")){
                    rabbits += amout;
                } else if (type.equalsIgnoreCase("R")){
                    rats += amout;
                } else if (type.equalsIgnoreCase("S")){
                    frogs += amout;
                }
                allAnimals+= amout;
            }
        }
        double rabbitsPercents =(double) (rabbits*100) /allAnimals;
        double ratsPercents = (double) (rats*100) /allAnimals;
        double frogsPercents= (double) (frogs*100) /allAnimals;

        System.out.printf("Total: %d cobaias%n",allAnimals);
        System.out.printf("Total de coelhos: %d%n",rabbits);
        System.out.printf("Total de ratos: %d%n",rats);
        System.out.printf("Total de sapos: %d%n",frogs);
        System.out.printf("Percentual de coelhos: %.2f %%%n",rabbitsPercents);
        System.out.printf("Percentual de ratos: %.2f %%%n",ratsPercents);
        System.out.printf("Percentual de sapos: %.2f %%%n",frogsPercents);

    }
}
