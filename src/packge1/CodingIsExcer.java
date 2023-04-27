package packge1;

import java.io.*;
/*25314번 코딩은 체육과목입니다.*/
public class CodingIsExcer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		int i = num / 4;

		for (int j = 0; j < i; j++) {
			sb.append("long ");
		}
		sb.append("int");
		bw.write(String.valueOf(sb));
		bw.flush();

		bw.close();
		br.close();
	}

}