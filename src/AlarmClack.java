import java.util.Scanner;


/*2884번 알람시계*/
public class AlarmClack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int alarmMinutes = M - 45;
        if (alarmMinutes < 0) {
            H = (H == 0) ? 23 : H-1;
            alarmMinutes += 60;
        }


        M = alarmMinutes;


        System.out.printf("%d %d",H,M);

    }
}
