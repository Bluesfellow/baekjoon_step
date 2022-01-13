import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());

		int[] arr = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
			if (arr[i] < X) {
				bw.write(arr[i] + " ");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
