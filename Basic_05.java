import java.util.*;

public class Basic_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ѩ�S����Ū����Ū�X��A�]���ݨϥΨ�while�j��Ӹ��D
		// �p�GŪ���٦��U�@�ӭȡA�~�ݭn���A�S���N�������X�j�鵲���{��
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