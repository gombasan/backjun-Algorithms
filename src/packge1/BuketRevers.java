package packge1;

import java.util.*;

/*10811번 바구니 뒤집기*/
public class BuketRevers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		int[] baskets = new int[N];
		for (int i = 0; i < N; i++) {
			baskets[i] = i + 1;
		}

		for (int k = 0; k < M; k++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();

			while (i < j) {
				int temp = baskets[i - 1];
				baskets[i - 1] = baskets[j - 1];
				baskets[j - 1] = temp;

				i++;
				j--;
			}
		}

		for (int basket : baskets) {
			System.out.print(basket + " ");
		}
	}
}

