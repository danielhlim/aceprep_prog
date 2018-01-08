import java.util.Scanner;

public class Program56 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Initial number of stars: ");
		int x=scanner.nextInt();
		
		for(int i = 0; i<x; i++) {
			for(int j=x-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
