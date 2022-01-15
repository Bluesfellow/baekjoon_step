import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		int result = A * B * C;

		int[] cnt = new int[10];

		while (true) {
			int result_remain = result % 10;
			result = result / 10;
			if (result_remain == 0)
				cnt[0]++;
			else if (result_remain == 1)
				cnt[1]++;
			else if (result_remain == 2)
				cnt[2]++;
			else if (result_remain == 3)
				cnt[3]++;
			else if (result_remain == 4)
				cnt[4]++;
			else if (result_remain == 5)
				cnt[5]++;
			else if (result_remain == 6)
				cnt[6]++;
			else if (result_remain == 7)
				cnt[7]++;
			else if (result_remain == 8)
				cnt[8]++;
			else if (result_remain == 9)
				cnt[9]++;

			if (result < 1)
				break;
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}
