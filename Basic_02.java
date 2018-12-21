
import java.util.Scanner;

public class Basic_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.next();
			double b = Double.parseDouble(a);
			System.out.printf("%3.1f\n", b * 1.6);
		}

	}
}
