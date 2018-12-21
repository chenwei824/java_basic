
import java.util.Scanner;

public class Basic_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double c = Math.sqrt(a * a + b * b);
			if (c > 100) {
				System.out.println("outside");
			} else {
				System.out.println("inside");
			}
		}

	}
}
