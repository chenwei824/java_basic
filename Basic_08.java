
import java.util.Scanner;

public class Basic_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = 2;
			while (a > b) {
				if (a % b ==0){
					System.out.println("NO");
					break;
				}else{
					b++;
				}
			}
			if (a==b){
				System.out.println("YES");
			}
		}

	}
}
