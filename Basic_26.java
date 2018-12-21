import java.util.*;

public class Basic_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] a = new int[n];
		String ss = sc.nextLine();
		String[] s = ss.split(" ");
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < s[i].length(); j++) {
				String qq = s[i].substring(j);
				sum += Integer.parseInt(qq.substring(0, 1));
			}
			a[i] = sum;
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j] || (a[i] == a[j] && Integer.parseInt(s[i]) > Integer.parseInt(s[j]))) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
					String g = s[i];
					s[i] = s[j];
					s[j] = g;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(s[i]);
			if (i != n - 1)
				System.out.print(" ");
		}
		System.out.println();
	}
}