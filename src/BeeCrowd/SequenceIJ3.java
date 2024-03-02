package BeeCrowd;

public class SequenceIJ3 {
    public static void main(String[] args) {

        Integer j = 7;
        Integer i = 1;
        i.intValue();
        j.intValue();

        while( i <= 9){
            System.out.printf("I=%d J=%d%n",i,j);
            System.out.printf("I=%d J=%d%n",i,j-1);
            System.out.printf("I=%d J=%d%n",i,j-2);

            i+= 2;
            j+= 2;
        }
    }
}
