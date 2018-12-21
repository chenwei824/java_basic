import java.util.*;

public class Basic_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
				sum += (int) s.charAt(j);
			}
			System.out.println(sum);
		}

	}
}