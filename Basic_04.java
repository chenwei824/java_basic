
import java.util.Scanner;

public class Basic_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int b1 = sc.nextInt();
			int b2 = sc.nextInt();

			int a = a1 * 60 + a2;
			int b = b1 * 60 + b2;
			int c = b - a;
			int total = 0;
			if (c > 240) {
				total = 280;
				total += (c - 240) / 30 * 60;
			} else if (c > 120) {
				total = 120;
				total += (c - 120) / 30 * 40;
			} else {
				total += c / 30 * 30;
			}
			System.out.println(total);
		}

	}
}
