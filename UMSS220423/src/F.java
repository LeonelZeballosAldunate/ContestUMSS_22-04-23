import java.util.Scanner;

public class F {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		
		char c[] = new char[n];
		
		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}
		
		int comilla = 0;
		
		for (int i = 0; i < n; i++) {
			
			switch (c[i]) {
				case ',':
					if (comilla < 1) {
						c[i] = '.';
					}
					
					break;
				case '"':
					comilla++;
					break;
			
			}
			
			if (comilla == 2) {
				comilla = 0;
			}
		
		}
		
		for (char z : c) {
			System.out.print(z);
		}
	}
}