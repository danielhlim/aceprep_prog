import java.util.Scanner;

public class Program55 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter X: ");
		double x = scanner.nextDouble();
		System.out.print("Enter N: ");
		double n = scanner.nextDouble();
		double mul =1;
		
		if(n<0) {
			System.out.println("N must be a positive integer");
		}
		else {
			for(int i=0; i<n; i++) {
				mul = x * mul;
			}
			System.out.println(mul);
		}
	}
}
