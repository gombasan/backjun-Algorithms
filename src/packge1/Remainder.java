package packge1;

import java.io.*;

/*3052번 나머지*/
public class Remainder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10];
		boolean[] isSame = new boolean[10];
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num % 42;

			for (int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					isSame[i] = true;
				}
			}

		}
		int result = 10;
		for (int i = 0; i < 10; i++) {
			if(isSame[i]) {
				result--;
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}