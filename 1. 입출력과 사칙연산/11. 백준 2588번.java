import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int b_1 = b % 10;
		int b_10 = (b  %  100) / 10;
		int b_100 = b / 100;
		
		int c = a * b_1;
		int d = a * b_10;
		int e = a * b_100;
		int f = c + (d * 10) + (e * 100);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.print(f);
	}

}
