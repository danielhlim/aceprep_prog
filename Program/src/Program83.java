import java.util.Scanner;

public class Program83 {
	public static void main(String[] args) {
		PrimeNumber();
	}
	public static void PrimeNumber() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int n = x/2;
		for(int i=2; i<n+1; i++) {
			if(x%i == 0) {
				System.out.println("number is not prime");
				break;
			}
			else {
				System.out.println("number is prime"); 
				break;
			}
		}
	}
}
