import java.util.*;

public class Basic_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[7];
		int sum = 0;
		int[] money = { 2000000, 200000, 40000, 10000, 4000, 1000, 200 };
		String[] g = new String[4];
		for (int i = 0; i < 4; i++) {
			g[i] = sc.nextLine();
		}
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			if (s.equals(g[0])) {
				sum += money[0];
				t[0] += 1;
			} else {
				boolean ch = false;
				for (int j = 1; j < 7; j++) {
					String c = s.substring(j - 1);
					for (int k = 1; k < 4; k++) {
						String v = g[k].substring(j - 1);
						if (c.equals(v)) {
							sum += money[j];
							t[j] += 1;
							ch = true;
							break;
						}
					}
					if (ch)
						break;
				}
			}
		}

		for (int i = 0; i < 7; i++) {
			System.out.print(t[i]);
			if (i != 7 - 1)
				System.out.print(" ");
		}
		System.out.println("\n" + sum);
	}
}