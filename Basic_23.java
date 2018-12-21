import java.util.*;

public class Basic_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		String[] s = ss.split(",");
		int n = Integer.parseInt(s[0]);
		int[] a = { 15, 20, 30 };
		for (int i = 1; i < 4; i++) {
			n -= Integer.parseInt(s[i]) * a[i - 1];
		}
		if (n < 0) {
			System.out.println(0);
		} else {
			int[] ans = new int[3];
			int[] val = { 1, 5, 50 };
			for (int i = 2; i >= 0; i--) {
				ans[i] = n / val[i];
				n = n - val[i] * ans[i];
			}
			for (int i = 0; i < 3; i++) {
				System.out.print(ans[i]);
				if (i != 2)
					System.out.print(",");
			}
			System.out.println();
		}
	}
}
