import java.util.Scanner;

public class D {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		long div = (long) x / 10;
		long divInt = (long) div;
		long prox;
		
		if (divInt > 0) {
			prox = (long) div + 1;
		}
		
		else {
			prox = (long) div - 1;
		}
		
		//System.out.println(divInt + " " + prox);
		
		if (x % 10 == 0) {
			System.out.println(x / 10);
		}
		
		else {
			
			double max = Math.max(divInt, prox);
			
			if (max < (double)div) {
				System.out.println((long) max);
			}
			
			else {
				System.out.println((long) Math.min(divInt, prox));
			}
			
		}
		
	}
	
}