import java.util.*;

public class Basic_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] b = { ' ', '@', '\"', '$', '%', '^', '*', '\'', ')', '_', '(', '+', '.', '=', '/', '/', '-', '2', '3',
				'4', '5', '6', '7', '8', '9', '0', '\"', '\'', '>', '=', '?', '?', '#', 's', 'n', 'v', 'f', 'r', 'g',
				'h', 'j', 'o', 'k', 'l', ':', '<', 'm', 'p', '{', 'w', 't', 'd', 'y', 'i', 'b', 'e', 'c', 'u', 'x', ']',
				'\\', '\\', '&', '+', '1', 's', 'n', 'v', 'f', 'r', 'g', 'h', 'j', 'o', 'k', 'l', ':', '<', 'm', 'p',
				'{', 'w', 't', 'd', 'y', 'i', 'b', 'e', 'c', 'u', 'x', '}', '|', '|' };
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < 94; j++) {
				if (s.charAt(i) == (char) (j + 32)) {
					System.out.print(b[j]);
					break;
				}
			}
		}
		System.out.println();

	}
}