package packge1;

import java.io.*;
import java.util.StringTokenizer;
/*10952번 A+B -5*/
public class APlusB5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (x + y == 0) {
				break;
			}
			sb.append(x + y).append("\n");
		}

		bw.write(String.valueOf(sb));
		bw.flush();

		bw.close();
		br.close();
	}

}
