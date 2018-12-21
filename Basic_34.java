import java.util.*;
import java.text.*;

public class Basic_34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		while (sc.hasNextInt()) {
			int h = sc.nextInt();
			int n = sc.nextInt();
			if (n == 1) {
				System.out.println(df.format((h - 80) * 0.7f));
			} else {
				System.out.println(df.format((h - 70) * 0.6f));
			}
		}

	}
}