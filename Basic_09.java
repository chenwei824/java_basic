
import java.util.Scanner;

public class Basic_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int total = 0;
			for (int i = 1; i <= a; i++) {
				if (i % 3 == 0) {
					total += i;
				}
			}
			System.out.println(total);
		}

	}
}
