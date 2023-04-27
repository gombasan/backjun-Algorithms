import java.io.*;
import java.util.StringTokenizer;

/*25304번 영수증*/
public class Receipt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		long total = Long.parseLong(br.readLine());
		int totalNum = Integer.parseInt(br.readLine());
		long totalPrice = 0L;
		for (int i = 0; i < totalNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			totalPrice = totalPrice + ((long) price * num);
		}

		String result = total == totalPrice ? "Yes" : "No";
		bw.write(result);
		bw.flush();
	}

}
