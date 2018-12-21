import java.util.*;

public class Basic_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < s.length(); i++) {
			int c = (int) s.charAt(i);
			if (c > 64 && c < 91) {
				c += k;
				if (c >= 91) {
					c = c % 91 + 65;
				}
			} else if (c > 96 && c < 123) {
				c += k;
				if (c >= 123) {
					c = c % 123 + 97;
				}
			} else if (c > 47 && c < 58) {
				c += k;
				if (c >= 58) {
					c = c % 58 + 48;
				}
			}
			System.out.print((char) c);
		}
		System.out.println();
	}
}