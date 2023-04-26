import java.util.Scanner;

/*2444번 별찍기 - 7 */
public class StarPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }

            else {
                for (int j = 1; j <= i - n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * (2 * n - i) - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
