import java.util.*;

public class Basic_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i_n = 0; i_n < n; i_n++) {
			String ss = sc.nextLine();
			String[] s = ss.split(" ");
			int[] a = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				String t = s[i].substring(0, 1);
				int k = Integer.parseInt(s[i].substring(1));
				if (t.equals("S"))
					k += 39;
				else if (t.equals("H"))
					k += 26;
				else if (t.equals("D"))
					k += 13;
				else if (t.equals("C"))
					k += 0;
				a[i] = k;
			}
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] < a[j]) {
						int g = a[i];
						a[i] = a[j];
						a[j] = g;
						String gg = s[i];
						s[i] = s[j];
						s[j] = gg;
					}
				}
			}
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i]);
				if (i != s.length - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}