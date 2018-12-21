import java.util.*;

public class Basic_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), d = sc.nextInt();
		int[] a = { 21, 19, 21, 21, 22, 22, 23, 24, 24, 24, 23, 22 };
		String[] b = { "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio",
				"Sagittarius", "Capricorn" };
		if (d >= a[m]) {
			System.out.println(b[m - 1]);
		} else {
			System.out.println(b[(m - 2 + 12) % 12]);
		}
	}
}