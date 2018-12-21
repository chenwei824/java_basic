import java.util.*;

public class Basic_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 由於沒有說讀取時讀幾行，因此需使用到while迴圈來解題
		// 如果讀取還有下一個值，才需要做，沒有就直接跳出迴圈結束程式
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			String str = Integer.toBinaryString(n);

			if (str.length() == 8) {
				System.out.println(str);
			} else if (str.length() > 8) {
				System.out.println(str.substring(str.length() - 8, str.length()));
			} else {
				for (int i = 0; i < 8 - str.length(); i++) {
					System.out.print(0);
				}
				System.out.println(str);
			}
		}
	}
}