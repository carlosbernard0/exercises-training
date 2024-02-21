package CarreiraTech.Fundamentos;
//5 - Escreva um programa Java que declare uma matriz 3x3 de doubles e preencha-a com
// os valores 1.0, 2.5 e 3.7 (para todas as linhas). Em seguida, use dois loops 'for' aninhados
// para imprimir cada elemento da matriz e a soma dos valores da coluna.
public class ex5 {
    public static void main(String[] args) {
        double[][] values = new double[3][3];

        double value1 = 1.0;
        double value2 = 2.5;
        double value3 = 3.7;

        for (int i = 0; i <3 ; i++) {
            values[i][0]=value1;
            values[i][1]=value2;
            values[i][2]=value3;
        }

        double[] sum= new double[3];


        for (int i = 0; i < 3; i++)  {
            double sumAux = 0.0;
            for (int j = 0; j < 3; j++) {
                System.out.println(values[i][j]+ "");
                sumAux += values[i][j];
            }
            sum[i] = sumAux;

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(sum[i]);

        }




    }
}
