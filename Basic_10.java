
import java.util.Scanner;

public class Basic_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 0;
			if (a > b) {
				c = b;
			} else {
				c = a;
			}
			int ans = 0;
			for (int i = 1; i <= c; i++) {
				if ((a % i == 0) && (b % i == 0)) {
					ans = i;
				}
			}
			System.out.println(ans);
		}

	}
}
