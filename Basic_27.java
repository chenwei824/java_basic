import java.util.*;

public class Basic_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = sc.nextLine();
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.equals("0000")) {
				break;
			} else {
				int a = 0, b = 0;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (ans.charAt(i) == s.charAt(j)) {
							if (i == j) {
								a++;
							} else {
								b++;
							}
						}
					}
				}
				System.out.println(a + "A" + b + "B");
			}
		}
	}
}