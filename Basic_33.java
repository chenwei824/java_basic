import java.util.*;

public class Basic_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String ss = sc.nextLine();
			String[] s = ss.split(" ");
			System.out.println("Size: " + s.length);
			double ans2 = 0d;
			for (int i = 0; i < s.length; i++) {
				ans2 += Integer.parseInt(s[i]);
			}
			ans2 /= s.length;
			System.out.printf("Average: " + "%3.3f\n", ans2);

		}

	}
}