import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
			if (M < 45) {
				M = M - 45 + 60;
				H -= 1;
				if (H < 0)
					H += 24;
				System.out.print(H + " " + M);
			} else
				System.out.print(H + " " + (M - 45));
		}
	}

}
