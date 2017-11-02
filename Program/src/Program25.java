import java.util.Scanner;

public class Program25 {
	public static void main(String args[]) {
		int x;
		int y;
		int GCF = 0;
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter a number: ");
		x = scanner.nextInt();
		
		System.out.print("Enter a second number: ");
		y = scanner.nextInt();
		
		for(int i = 1; i <= x; i ++) {
			if(x%1 == 0 && y%i == 0) {
				GCF = i;
			}
		}
		System.out.println(GCF);
	}
}
