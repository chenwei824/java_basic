import java.util.*;

public class Basic_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[25];
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			for (int j = s; j < d; j++) {
				a[j]++;
			}
		}
		int max = 0;
		for (int i = 0; i < 25; i++) {
			max = Math.max(max, a[i]);
		}
		System.out.println(max);

	}
}