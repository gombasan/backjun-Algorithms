package packge1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*2480번 주사위 세개*/
public class ThreeDice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.sort(Collections.reverseOrder());


		int total = 0;
		if(a == b && b == c) {
			total = 10000 + a * 1000;
		}
		else if(a == b) {
			total = 1000 + b * 100;
		}
		else if(b == c) {
			total = 1000 + c * 100;
		}
		else if(a == c) {
			total = 1000 + a * 100;
		}
		else {
			total = list.get(0) * 100;
		}

		System.out.println(total);


		sc.close();
	}
}