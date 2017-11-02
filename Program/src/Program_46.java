import java.util.Scanner;

public class Program_46 {
	public static void main(String args[]) {
		int x;
		int y;
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Start: ");
		x = scanner.nextInt();
		
		System.out.print("Enter End: ");
		y = scanner.nextInt();
		
		for (int i = x; i <= y; i++) {
			n = i;
			System.out.println(n);
		}
	}
}
