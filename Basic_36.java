import java.util.*;

public class Basic_36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
				System.out.println("Bissextile Year");
			} else {
				System.out.println("Common Year");
			}
		}
	}
}