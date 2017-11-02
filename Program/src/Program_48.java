import java.util.Scanner;

public class Program_48 {
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String a = scanner.nextLine();
		System.out.print("Enter second word");
		String b = scanner.nextLine();
		int c = b.length();
		int n = a.length();
		int x = 30-n-c;
		System.out.print(a);

		for (int i=0; i<x; i++) {
			System.out.print(".");
			
		}
		System.out.print(b);
		
	}
}
