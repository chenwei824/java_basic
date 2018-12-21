import java.util.*;

public class Basic_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i_n = 0; i_n < n; i_n++) {
			int t = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
			int[] a = new int[k];
			for (int i_k = 0; i_k < k; i_k++) {
				a[i_k] = sc.nextInt();
			}
			Arrays.sort(a);
			int sum = 0;
			for (int i_m = 0; i_m < m; i_m++) {
				sum += a[i_m];
			}
			if (sum <= t) {
				System.out.println(sum);
			} else {
				System.out.println("Impossible");
			}
		}

	}
}