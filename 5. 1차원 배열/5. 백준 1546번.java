import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double[] arr = new double[N];
		double sum = 0, avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / arr[arr.length - 1] * 100;
			sum += arr[i];
		}
		avg = sum / N;

		System.out.print(avg);
	}
}
