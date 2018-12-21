import java.util.*;

public class Basic_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i_n = 0; i_n < n; i_n++) {
			String ss = sc.nextLine();
			String[] s = ss.split(" ");
			String[] a = new String[32];
			String[] b = new String[32];
			int[] c = new int[32];
			for (int i = 0; i < 32; i++) {
				a[i] = "0";
				b[i] = "0";
			}
			int p = 0;
			for (int i = s[0].length() - 1; i >= 0; i--) {
				a[p] = Character.toString(s[0].charAt(i));
				p++;
			}
			p = 0;
			for (int i = s[1].length() - 1; i >= 0; i--) {
				b[p] = Character.toString(s[1].charAt(i));
				p++;
			}

			int d = 0;
			for (int i = 0; i < 31; i++) {
				c[i] = (Integer.parseInt(a[i]) + Integer.parseInt(b[i]) + d) % 10;
				d = (Integer.parseInt(a[i]) + Integer.parseInt(b[i]) + d) / 10;
			}
			int k = 0;
			for (k = 31; k >= 0; k--) {
				if (c[k] != 0)
					break;
			}
			String ans = "";
			for (int i = k; i >= 0; i--) {
				ans += c[i];
			}
			System.out.println(ans);

		}

	}
}