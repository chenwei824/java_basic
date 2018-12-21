
import java.util.Scanner;

public class Basic_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String all = sc.next();
		String[] a1 = { "*****", "    *", "*****", "*****", "*   *", "*****", "*****", "*****", "*****", "*****" };
		String[] a2 = { "*   *", "    *", "    *", "    *", "*   *", "*    ", "*    ", "    *", "*   *", "*   *" };
		String[] a3 = { "*   *", "    *", "*****", "*****", "*****", "*****", "*****", "    *", "*****", "*****" };
		String[] a4 = { "*   *", "    *", "*    ", "    *", "    *", "    *", "*   *", "    *", "*   *", "    *" };
		String[] a5 = { "*****", "    *", "*****", "*****", "    *", "*****", "*****", "    *", "*****", "    *" };
		for (int i = 0; i < 3; i++) {
			System.out.print(a1[Integer.parseInt(all.substring(i, (i + 1)))]+ " ");
		}
		System.out.println(a1[Integer.parseInt(all.substring(3, 4))]);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(a2[Integer.parseInt(all.substring(i, (i + 1)))]+ " ");
		}
		System.out.println(a2[Integer.parseInt(all.substring(3, 4))]);

		for (int i = 0; i < 3; i++) {
			System.out.print(a3[Integer.parseInt(all.substring(i, (i + 1)))]+ " ");
		}
		System.out.println(a3[Integer.parseInt(all.substring(3, 4))]);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(a4[Integer.parseInt(all.substring(i, (i + 1)))]+ " ");
		}
		System.out.println(a4[Integer.parseInt(all.substring(3, 4))]);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(a5[Integer.parseInt(all.substring(i, (i + 1)))]+ " ");
		}
		System.out.println(a5[Integer.parseInt(all.substring(3, 4))]);
		
		
	}
}
