import java.util.*;

public class Basic_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		String ans = "False";
		for (int i = 0; i < 3; i++) {
			if ((a[i][0] == a[i][1] && a[i][1] == a[i][2]) || (a[0][i] == a[1][i] && a[1][i] == a[2][i])) {
				ans = "True";
				break;
			}
		}
		if (a[0][0] == a[1][1] && a[1][1] == a[2][2] || a[0][2] == a[1][1] && a[1][1] == a[2][0]) {
			ans = "True";
		}
		System.out.println(ans);
	}
}