package packge1;

import java.io.*;
import java.util.StringTokenizer;

/*10813번 공 바꾸기*/
public class BallChange {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer first = new StringTokenizer(br.readLine());
		int arrNum = Integer.parseInt(first.nextToken());
		int repeat = Integer.parseInt(first.nextToken());
		int[] arr = new int[arrNum];

		for (int i = 0; i < arrNum; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < repeat; i++) {
			StringTokenizer second = new StringTokenizer(br.readLine());
			int ball1 = Integer.parseInt(second.nextToken()) - 1;
			int ball2 = Integer.parseInt(second.nextToken()) - 1;
			int temp = arr[ball1];
			arr[ball1] = arr[ball2];
			arr[ball2] = temp;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arrNum; i++) {
			sb.append(arr[i]).append(" ");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
