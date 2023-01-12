import java.util.Scanner;


/*2525번 오픈시계*/
public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int reservation = sc.nextInt();

        H = (H + (reservation+M)/60)%24;
        M = (M + reservation)%60;

        System.out.printf("%d %d",H,M);

    }
}
