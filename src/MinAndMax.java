import java.io.*;
import java.util.StringTokenizer;

/*10818번 최소,최대*/
public class MinAndMax {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = -1000000;
		int min = 1000000;
		for (int i = 0; i < num; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
			if (arr[i] <= min) {
				min = arr[i];
			}

		}
		StringBuilder sb = new StringBuilder();
		sb.append(min).append(" ").append(max);
		bw.write(String.valueOf(sb));
		bw.flush();

		bw.close();
		br.close();

	}

}
