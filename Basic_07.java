import java.util.*;  
  
public class Basic_07 {  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);  
        int n = Integer.parseInt(sc.nextLine());  
        for (int i=0;i<n;i++){  
            String ss = sc.nextLine();
			String[]s = ss.split(" ");  
            int a = Integer.parseInt(s[1]);  
            int b = Integer.parseInt(s[2]);  
            int c = Integer.parseInt(s[3]);  
            int d = Integer.parseInt(s[4]);  
            if (s[0].equals("+")) {  
                System.out.println((a + c) + " " + (b + d));  
            } 
			else if (s[0].equals("-")) {  
                System.out.println((a - c) + " " + (b - d));  
            } 
			else if (s[0].equals("*")) {  
                System.out.println((a * c - b * d) + " " + (a * d + b * c));  
            }  
        }  
    }  
}  