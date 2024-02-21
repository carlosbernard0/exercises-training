package BeeCrowd;

import java.util.Scanner;

public class CoordinatesOfAPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pointX, pointY;
        pointX = input.nextDouble();
        pointY = input.nextDouble();

        if (pointX == 0.0 && pointY == 0.0) {
            System.out.println("Origem");
        } else if (pointX == 0.0 && pointY != 0.0) {
            System.out.println("Eixo Y");
        } else if (pointX != 0.0 && pointY == 0.0) {
            System.out.println("Eixo X");
        } else if (pointX > 0.0  && pointY > 0.0) {
            System.out.println("Q1");
        }else if (pointX < 0.0 && pointY > 0.0){
            System.out.println("Q2");
        } else if (pointX < 0.0 && pointY < 0.0) {
            System.out.println("Q3");
        }else if (pointX > 0.0 && pointY < 0.0){
            System.out.println("Q4");
        }
    }
}
