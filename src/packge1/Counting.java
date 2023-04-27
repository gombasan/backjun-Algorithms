package packge1;

import java.io.*;
import java.util.StringTokenizer;

/*10807번 개수 세기*/
public class Counting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int current = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			int temp = Integer.parseInt(st.nextToken());

			if (temp == current) {
				result++;
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();

		bw.close();
		br.close();

	}

}
