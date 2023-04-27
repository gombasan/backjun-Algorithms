import java.util.Scanner;
/*8393번 합*/
public class Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println(total(a));
	}

	static int total(int a) {

		if(a == 0) {
			return 0;
		}
		else {
			return a + total(a-1);
		}
	}

}
