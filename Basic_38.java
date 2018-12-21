import java.util.*;

public class Basic_38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum1 = 0d, sum2 = 0d;
		if (n > 700) {
			sum1 += 5.63 * (n - 700);
			sum2 += 4.50 * (n - 700);
		}
		n = Math.min(n, 700);
		if (n > 500) {
			sum1 += 4.97 * (n - 500);
			sum2 += 4.01 * (n - 500);
		}
		n = Math.min(n, 500);
		if (n > 330) {
			sum1 += 4.39 * (n - 330);
			sum2 += 3.61 * (n - 330);
		}
		n = Math.min(n, 330);
		if (n > 120) {
			sum1 += 3.02 * (n - 120);
			sum2 += 2.68 * (n - 120);
		}
		n = Math.min(n, 120);
		if (n > 0) {
			sum1 += 2.10 * n;
			sum2 += 2.10 * n;
		}
		System.out.printf("Summer months:" + "%1.2f\n", sum1);
		System.out.printf("Non-Summer months:" + "%1.2f\n", sum2);

	}
}