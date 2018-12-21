import java.util.*;

public class Basic_39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i_n = 0; i_n < n; i_n++) {
			int g = 0, sum = 0;
			boolean ch = false;
			for (int i = 0; i < 3; i++) {
				int k = sc.nextInt();
				sum += k;
				if (k < 60)
					g++;
				if (k >= 80)
					ch = true;
			}
			if (g == 0) {
				System.out.println("P");
			} else if (g == 1 && sum >= 220) {
				System.out.println("P");
			} else if (g == 1 && sum <= 220) {
				System.out.println("M");
			} else if (g == 2 && ch) {
				System.out.println("M");
			} else {
				System.out.println("F");
			}
		}
	}
}