package BeeCrowd;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 1;
        int quantitiesGrenais = 0;
        int victoriesInter = 0;
        int victoriesGremio = 0;
        int draws = 0;

        while (option == 1){
            int goalInter,goalGremio;
            if ((goalInter = input.nextInt()) > (goalGremio = input.nextInt())){
                victoriesInter++;
            }else if(goalGremio > goalInter){
                victoriesGremio++;
            }else {
                draws++;
            }


            System.out.println("Novo grenal (1-sim 2-nao)");
            option = input.nextInt();
            quantitiesGrenais++;

        }

        System.out.println(quantitiesGrenais+" grenais");
        System.out.println("Inter:"+victoriesInter);
        System.out.println("Gremio:"+victoriesGremio);
        System.out.println("Empates:"+draws);
        if (victoriesGremio > victoriesInter){
            System.out.println("Gremio venceu mais");
        } else if (victoriesGremio < victoriesInter) {
            System.out.println("Inter venceu mais");
        }else {
            System.out.println("Não houve vencedor");
        }
    }
}
