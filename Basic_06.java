
import java.util.Scanner;

public class Basic_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			if (a>=3 && a<=5){
				System.out.println("Spring");
			}else	if (a>=6 && a<=8){
				System.out.println("Summer");
			}else	if (a>=9 && a<=11){
				System.out.println("Autumn");
			}else	{
				System.out.println("Winter");
			}
		}

	}
}
