import java.util.Scanner;

public class Program69 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n=0;
		System.out.print("Enter a number: ");
		n = scanner.nextInt();

		while(n!=1) {
			if(n==1) {
				System.out.print("(stop calculation)");
				System.exit(0);
			}
			if(n%2==1) {
				System.out.println("(odd, next value is " + n + "*" + n + "+" + "1)");
				n=3*n+1;
				System.out.print(n);
			}
			if(n%2==0) {
				System.out.println("(even, next value is " + n + "/2)");
				n=n/2;
				System.out.print(n); 
			}
		}
		System.out.println(" (Stop calculation)");
	}
}
