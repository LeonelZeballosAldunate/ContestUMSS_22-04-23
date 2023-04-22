import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contO = 0;
		int contMin = 0;
		boolean ban = true;
		boolean isBad = false;
		
		String s = sc.next();
		
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'x') {
				isBad = true;
				break;
			}
			
			else if (s.charAt(i) == 'o') {
				contO++;
			}
			
			else if (s.charAt(i) == '-') {
				contMin++;
			}
		}
		
		String res = "";
		
		if (isBad) {
			res = "No";
		}
		
		else {
			if (contMin > contO) {
				res = "No";
			}
			
			else {
				res = "Yes";
			}
		}
		
		System.out.println(res);
		
	}
	
}