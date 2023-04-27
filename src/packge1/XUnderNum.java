package packge1;

import java.io.*;
import java.util.StringTokenizer;

/*10871번 X보다 작은 수*/
public class XUnderNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer first = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(first.nextToken());
		int current = Integer.parseInt(first.nextToken());
		StringTokenizer second = new StringTokenizer(br.readLine());

		for (int i = 0; i < num; i++) {
			int arrNum = Integer.parseInt(second.nextToken());
			if (current > arrNum) {
				sb.append(arrNum).append(" ");

			}
		}
		bw.write(String.valueOf(sb));
		bw.flush();

		bw.close();
		br.close();

	}

}
