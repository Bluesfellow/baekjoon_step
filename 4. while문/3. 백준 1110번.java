import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0; // 사이클 카운트 변수
		int N_Copy = N; // 초기 N값을 담을 변수

		while (true) {
			int N_10 = N / 10;
			int N_1 = N % 10;
			N = (N_1 * 10) + ((N_10 + N_1) % 10);
			cnt++;

			if (N_Copy == N) {
				break;
			}
		}
		bw.write(String.valueOf(cnt));	// 또는 bw.write(cnt + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
