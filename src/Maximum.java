import java.io.*;

/*2562번 최댓값*/
public class Maximum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
				index = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(index);
	}

}
