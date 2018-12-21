import java.util.*;

public class Basic_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int sum = 0;
		for (int i = 0; i <= s2.length() - s1.length(); i++) {
			String ss = s2.substring(i);
			String s = ss.substring(0, s1.length());
			if (s.equals(s1)) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}
}