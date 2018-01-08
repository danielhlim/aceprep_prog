import java.util.Scanner;

public class Program54 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Upper Limit: ");
		int n = scanner.nextInt();
		int s=(n*(n+1)*(2*n+1))/6;
		System.out.println("The sum of squares is: " + s);
		int c=(n*n*(n+1)*(n+1))/4;
		System.out.println("The sum of cubes is: " + c);
	}
}
