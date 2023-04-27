import java.io.*;
import java.util.StringTokenizer;

/*10810번 공 넣기*/
public class BallInsert {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer first = new StringTokenizer(br.readLine());
		int arrNum = Integer.parseInt(first.nextToken());
		int repeat = Integer.parseInt(first.nextToken());
		int[] arr = new int[arrNum];

		for (int i = 0; i < repeat; i++) {
			StringTokenizer second = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(second.nextToken()) - 1;
			int end = Integer.parseInt(second.nextToken()) - 1;
			int ballNum = Integer.parseInt(second.nextToken());

			for (int j = 0; j <= end - begin; j++) {
				arr[begin + j] = ballNum;
			}
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
