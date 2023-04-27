package packge1;

import java.util.Scanner;

/*5597번 과제 안 내신 분..?*/
public class DontHomework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];

		for (int i = 0; i < 28; i++) {
			int people = sc.nextInt();
			arr[people -1] = people;
		}

		for (int i = 0; i < 30; i++) {
			if(arr[i] == 0) {
				System.out.println(i+1);
			}
		}
		sc.close();
	}
}
