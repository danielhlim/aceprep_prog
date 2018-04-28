import java.util.Scanner;

public class Program89 {
	public static void main(String args[]) {
		isPrime();
	}
	public static void isPrime() {
		boolean isPrime = true;
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		for(int j=2; j<x/2; j++) {
			if(x%j == 0) {
				isPrime = false;
			}
		} 
		if(isPrime = true) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("it is not prime");
		}
	}
}
