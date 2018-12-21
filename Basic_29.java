import java.util.*;

public class Basic_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String f = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		int xx = f.indexOf(s.charAt(0)) + 10;
		int x1 = xx / 10;
		int x2 = xx % 10;

		int p = x1 + 9 * x2 + Character.getNumericValue(s.charAt(8)) + Character.getNumericValue(s.charAt(9));
		for (int i = 1; i < 8; i++)
			p += Character.getNumericValue(s.charAt(i)) * (9 - i);

		if (p % 10 == 0) {
			System.out.println("CORRECT!!!");
		} else {
			System.out.println("WRONG!!!");
		}
	}
}