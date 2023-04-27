import java.io.*;

/*2438번 별찍기 -1*/
public class StarPrint1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
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