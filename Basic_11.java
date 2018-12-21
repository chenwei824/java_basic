
import java.util.Scanner;

public class Basic_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int[][] a = new int[a2][a1];
			for (int i = 0;i<a1;i++){
				for (int j = 0;j<a2;j++){
					a[j][i] = sc.nextInt();
				}
			}

			for (int i = 0; i < a2; i++) {
				for (int j = 0; j < a1; j++) {
					if (j != a1 - 1) {
						System.out.print(a[i][j] + " ");
					} else {
						System.out.print(a[i][j]);
					}
				}
				System.out.println();
			}
		}

	}
}
