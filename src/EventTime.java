import java.util.Scanner;

public class EventTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] dayI= input.nextLine().split(" ");
        String[] hourI= input.nextLine().replaceAll(" ", "").split(":");
        String[] dayF= input.nextLine().split(" ");
        String[] hourF= input.nextLine().replaceAll(" ", "").split(":");

        int day1 = Integer.parseInt(dayI[1]);
        int hour1 = Integer.parseInt(hourI[0]);
        int minute1 = Integer.parseInt(hourI[1]);
        int second1 = Integer.parseInt(hourI[2]);
        int day2= Integer.parseInt(dayF[1]);
        int hour2 = Integer.parseInt(hourF[0]);
        int minute2 = Integer.parseInt(hourF[1]);
        int second2 = Integer.parseInt(hourF[2]);

        int q1, q2, allDays, time;
        q1 = second1 + minute1*60 + hour1*3600 + day1*86400;
        q2 = second2 + minute2*60 + hour2*3600 + day2*86400;
        allDays = q2 - q1;

        System.out.printf("%d dia(s)%n", allDays /86400);
        allDays = allDays % 86400;
        System.out.printf("%d hora(s)%n",allDays /3600);
        allDays = allDays % 3600;
        System.out.printf("%d minuto(s)%n", allDays/60);
        allDays =allDays % 60;
        System.out.printf("%d segundo(s)%n",allDays);

        input.close();
    }
}
