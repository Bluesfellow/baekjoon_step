import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			for (int j = N - i; j > 0; j--) {
				bw.write(" ");
			}
			for (int k = 1; k <= i; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
