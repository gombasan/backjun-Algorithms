import java.io.*;
import java.util.StringTokenizer;
/*15552번 빠른 A+B*/
public class FaseAPlusB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		for (int j = 0; j < num; j++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			sb.append(x + y).append("\n");

		}
		bw.write(String.valueOf(sb));
		bw.flush();

		bw.close();
		br.close();
	}

}