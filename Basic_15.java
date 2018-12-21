import java.util.*;

public class Basic_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		System.out.println(ss.length);
		String a = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
		int[] b = new int[52];
		for (int i = 0; i < s.length(); i++) {
			String c = Character.toString(s.charAt(i));
			int d = a.indexOf(c);
			if (d != -1)
				b[d] += 1;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				System.out.println(a.charAt(i) + " : " + b[i]);
			}
		}
	}
}