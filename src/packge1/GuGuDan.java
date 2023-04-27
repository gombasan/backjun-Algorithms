package packge1;

import java.util.Scanner;

/*2739번 구구단*/
public class GuGuDan {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < 9; i++) {
			int total = num * (i+1);
			System.out.printf("%d * %d = %d\n",num,(i+1),total);
		}

	}
}