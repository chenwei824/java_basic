import java.util.*;

public class Basic_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] a = new float[10];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextFloat();
		Arrays.sort(a);
		System.out.printf("maximum:" + "%3.2f\n", a[9]);
		System.out.printf("minimum:" + "%3.2f\n", a[0]);
	}
}