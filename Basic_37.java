import java.util.*;

public class Basic_37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mask = new int[7];
		int k = 0, h = 0, max = 0, sum = 0;
		for (int i = 0; i < 4; i++) {
			mask[sc.nextInt()] += 1;
		}
		String ans = "";
		for (int i = 1; i < 7; i++) {
			if (mask[i] == 1) {
				k++;
				sum += i;
			}
			if (mask[i] == 2) {
				h++;
				if (i > max)
					max = i;
			}
			if (mask[i] == 4) {
				ans = "WIN";
			} else if (mask[i] == 3 || k == 4) {
				ans = "R";
			}
		}
		if (ans.equals("")) {
			if (h == 2) {
				System.out.println(max * 2);
			} else {
				System.out.println(sum);
			}
		} else {
			System.out.println(ans);
		}
	}
}