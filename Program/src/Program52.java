import java.util.Scanner;

public class Program52 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many integers will be added?: ");
		int n = scanner.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			System.out.println("Enter an integer: ");
			int a = scanner.nextInt();
			sum = sum +a;
		}
		
		System.out.println("The sum is: " + sum);
	} 
}
