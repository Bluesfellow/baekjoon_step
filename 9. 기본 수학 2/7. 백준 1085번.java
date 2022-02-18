import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int w = scanner.nextInt();
		int h = scanner.nextInt();

		int a = y;
		int b = h - y;
		int c = x;
		int d = w - x;

		int arr[] = { a, b, c, d };

		Arrays.sort(arr);

		System.out.print(arr[0]);
	}
}
