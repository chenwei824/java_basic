import java.util.*;

public class Basic_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		String[] s = ss.split(" ");
		int[][] a = new int[3][11];
		for (int i = 1; i <= 10; i++) {
			if (s[i - 1].equals("X")) {
				a[0][i] = 10;
			} else {
				a[0][i] = Integer.parseInt(s[i - 1]);
			}
		}
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j <= 10; j++) {
				a[i][j] = a[i - 1][j] + a[i][j - 1];
			}
		}
		if (a[2][10] % 11 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}