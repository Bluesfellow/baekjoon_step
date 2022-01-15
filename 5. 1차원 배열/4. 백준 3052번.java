import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i<10; i++) {
			hs.add(scanner.nextInt() % 42);
		}
		
		scanner.close();
		System.out.print(hs.size());
	}
}
