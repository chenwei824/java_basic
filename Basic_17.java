import java.util.*;

public class Basic_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		ss = ss.toLowerCase();
		String[] s = ss.split(" ");
		ArrayList<String> a = new ArrayList<String>();

		for (int i = 0; i < s.length; i++) {
			if (a.indexOf(s[i]) == -1) {
				if (a.size() > 0) {
					System.out.print(" " + s[i]);
				} else {
					System.out.print(s[i]);
				}
				a.add(s[i]);
			}
		}
		System.out.println();
	}
}