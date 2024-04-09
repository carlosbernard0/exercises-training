package BeeCrowd;

import java.util.Scanner;


public class ArrayReplacementI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int num = input.nextInt();
            if(num > 0){
                array[i]= num; 
            }else{
                array[i]= 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("X[%d] = %d%n",i,array[i]);
        }
    }
}