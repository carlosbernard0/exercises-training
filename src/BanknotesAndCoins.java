import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value = input.nextDouble();

        System.out.println("NOTAS:");

        int notes100 = (int) (value /100);
        System.out.printf("%d nota(s) de R$ 100.00%n",notes100);
        value = value %100.0;

        int notes50 = (int) value /50;
        System.out.printf("%d nota(s) de R$ 50.00%n", notes50);
        value = value %50.0;

        int notes20 = (int) value /20;
        System.out.printf("%d nota(s) de R$ 20.00%n",notes20);
        value = value %20.0;

        int notes10 = (int) value /10;
        System.out.printf("%d nota(s) de R$ 10.00%n",notes10);
        value = value %10.0;

        int notes5 = (int) value /5;
        System.out.printf("%d nota(s) de R$ 5.00%n",notes5);
        value = value %5.0;

        int notes2 = (int) value/2;
        System.out.printf("%d nota(s) de R$ 2.00%n",notes2);
        value = value %2.0;

        value *= 100.0;

        System.out.println("MOEDAS:");

        int coins1 = (int) value /100;
        System.out.printf("%d moeda(s) de R$ 1.00%n",coins1);
        value %= 100.0;

        int coins05 = (int) value/50;
        System.out.printf("%d moeda(s) de R$ 0.50%n", coins05);
        value %= 50.0;

        int coins025 = (int) value /25;
        System.out.printf("%d moeda(s) de R$ 0.25%n", coins025);
        value%= 25.0;

        int coins010 = (int) value /10;
        System.out.printf("%d moeda(s) de R$ 0.10%n", coins010);
        value%= 10.0;

        int coins005 = (int)value /5;
        System.out.printf("%d moeda(s) de R$ 0.05%n", coins005);
        value %= 5;

        int coins001 = (int) value /1;
        System.out.printf("%d moeda(s) de R$ 0.01%n", coins001);

        input.close();
    }
}
