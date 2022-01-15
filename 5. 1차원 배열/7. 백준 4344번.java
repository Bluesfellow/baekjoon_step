import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int C = scanner.nextInt();

		for (int i = 0; i < C; i++) {
			int N = scanner.nextInt();
			int[] score = new int[N];
			int sum = 0;

			for (int j = 0; j < N; j++) {
				score[j] = scanner.nextInt();
				sum += score[j];
			}

			double avg = sum / N;
			double count = 0;

			for (int j = 0; j < N; j++) {
				if (score[j] > avg) {
					count++;
				}
			}

			System.out.printf("%.3f%%\n", count / N * 100);
		}
	}
}
