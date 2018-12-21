import java.util.*;

public class Basic_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			String s1 = s.substring(0, s.length() / 2), s2 = "";
			if (s.length() % 2 == 0) {
				for (int i = s.length() / 2; i < s.length(); i++) {
					s2 = s.charAt(i) + s2;
				}
			} else {
				for (int i = s.length() / 2 + 1; i < s.length(); i++) {
					s2 = s.charAt(i) + s2;
				}
			}
			if (s1.equals(s2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}