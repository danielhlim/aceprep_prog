import java.util.Scanner;

public class Program66 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.print("Enter the monthly payment: ");
		n=scanner.nextInt();
		double b = 1000;
		double month = 0;
		double pay = 0;
		
		while(b > 0) {
			b = (b+1000 * 0.015)-n ;
			month++;
			pay = month*n;
			System.out.println("Month:\t " + month + "   balance: " + b + " total payments: " + pay);
			
		}
		
	}
}
