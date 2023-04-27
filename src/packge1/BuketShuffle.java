package packge1;

import java.util.Scanner;

/*10821번 바구니 순서 바꾸기*/
public class BuketShuffle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bukets = new int[n];
        int[] begin = new int[m];
        int[] end = new int[m];
        int[] mid = new int[m];

        for (int i = 0; i < n; i++) {
            bukets[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            begin[i] = sc.nextInt() - 1;
            end[i] = sc.nextInt() - 1;
            mid[i] = sc.nextInt() - 1;
        }

        // 로직 시작.


        for (int j = 0; j < m; j++) {
            int[] shuffleBukets = new int[n];

            for (int i = 0; i < n; i++) {

                if (begin[j] <= i && i <= end[j]) {

                    if (i >= mid[j]) {
                        shuffleBukets[i - (mid[j] - begin[j])] = bukets[i];
                    } else {
                        shuffleBukets[i + (end[j] - mid[j] + 1)] = bukets[i];
                    }

                } else {
                    shuffleBukets[i] = bukets[i];
                }
            }
            bukets = shuffleBukets;
        }


        for (int buket : bukets) {
            System.out.printf("%d ", buket);
        }

    }

}
