import java.util.Scanner;

public class H {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		String res = "Yes";
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//for (int i = 0; i < n - k; i++) {
		
		int i = 0;
			while (isSort(arr) == false && i+k != n) {
				int aux = arr[i];
				
				arr[i] = arr[i + k];
				arr[i + k] = aux;
				
				i++;
			}
			
			if (i == n - k) {
				res = "No";
			}
		//}
		System.out.println(res);
		
	}
	
	public static boolean isSort(int z[]) {
		boolean is = true;
		
		for (int i = 0; i < z.length - 1; i++) {
			if (z[i] > z[i + 1]) {
				is = false;
			}
		}
		
		return is;
	}
}