import java.util.Scanner;

public class Program70 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers?: ");
		int x = scanner.nextInt();
		int temp = 0;
		int[] ar = new int[x];
		
		for (int i = 0; i<x; i++) {
			ar[i] = scanner.nextInt();
		}
		
		for(int i = 0 ; i < ar.length ; i++) {
			for(int j = i + 1; j < ar.length ; j++) {
				if(ar[j] < ar[i]) {
					temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
 