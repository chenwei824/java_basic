import java.util.*;

public class Basic_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			String ss = sc.nextLine();
			String[] s = ss.split(" ");
			ArrayList<String> a = new ArrayList<String>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			for (int i = 0; i < s.length; i++) {
				if (a.indexOf(s[i]) == -1) {
					a.add(s[i]);
					b.add(1);
				} else {
					b.set(a.indexOf(s[i]), b.get(a.indexOf(s[i])) + 1);
				}
			}

			int max = 0, ind = 0;
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i) > max) {
					max = b.get(i);
					ind = i;
				}
			}
			if (max > s.length / 2) {
				System.out.println(a.get(ind));
			} else {
				System.out.println("NO");
			}
		}

	}
}