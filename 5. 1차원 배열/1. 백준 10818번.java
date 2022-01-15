import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int min = 0;
		int max = 0;
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		
		min = arr[0];
		max = arr[arr.length - 1];
		
		bw.write(min + " " + max);

		br.close();
		bw.flush();
		bw.close();
	}

}
