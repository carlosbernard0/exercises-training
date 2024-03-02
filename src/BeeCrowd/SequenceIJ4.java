package BeeCrowd;

public class SequenceIJ4 {
    public static void main(String[] args) {


        double i = 0.0;
        double j = 1.0;


        while(i < 2.1){
            if (i > 1.9){
                i = 2;
            }
            if (i==0.0||i == 1.0 || i == 2){
                System.out.printf("I=%.0f J=%.0f%n",i,j);
                System.out.printf("I=%.0f J=%.0f%n",i,j+1);
                System.out.printf("I=%.0f J=%.0f%n",i,j+2);
            } else {
                System.out.printf("I=%.1f J=%.1f%n",i,j);
                System.out.printf("I=%.1f J=%.1f%n",i,j+1);
                System.out.printf("I=%.1f J=%.1f%n",i,j+2);
            }


            i += .2;
            j += .2;

        }
    }
}
