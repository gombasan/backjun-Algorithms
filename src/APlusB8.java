import java.io.*;
import java.util.StringTokenizer;
/*11022번 A+B -8*/
public class APlusB8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		for (int j = 0; j < num; j++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			sb.append("Case #")
				.append(j + 1)
				.append(": ")
				.append(x)
				.append(" + ")
				.append(y)
				.append(" = ")
				.append(x + y)
				.append("\n");

		}
		bw.write(String.valueOf(sb));
		bw.flush();

		bw.close();
		br.close();
	}

}
