package packge1;

import java.io.*;

/*2439번 별찍기 -2*/
public class StarPrint2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {


			for (int j = 0; j < num - i; j++) {
				sb.append(" ");
			}

			for (int k = 0; k < i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		bw.write(String.valueOf(sb));
		bw.flush();

		bw.close();
		br.close();
	}

}