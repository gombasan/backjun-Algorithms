package packge1;

import java.util.Scanner;

/*10951번 A+B -4*/
public class APlusB4 {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			x = sc.nextInt();
			y = sc.nextInt();

			System.out.println(x + y);
		}

		sc.close();
	}

}
