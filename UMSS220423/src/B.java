import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char[] o = new char[4];
		
		for (int i = 0; i < 4; i++) {
			o[i] = s.charAt(i);
		}
		
		for (int i = 0; i < 3; i++) {
			char aux;
			o[i + 1] = s.charAt(i);
			o[0] = '0';
		}
		
		for (char z : o) {
			System.out.print(z);
		}
		
	}
	
}