import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		String num = scanner.next();

		String[] arr = num.split("");

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}

		System.out.print(sum);
	}
}
