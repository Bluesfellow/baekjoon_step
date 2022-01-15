import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		String[] testCase = new String[N];



		for(int i = 0; i<testCase.length; i++) {
			testCase[i] = scanner.next();
		}
		
		for (int i = 0; i < testCase.length; i++) {
			int cnt = 0;
			int score = 0;
			
			for (int j = 0; j < testCase[i].length(); j++) {
				if (testCase[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				score += cnt;
			}
			System.out.println(score);
		}
	}
}
