import java.util.Scanner;

public class Program24 {
	public static void main(String args[]) {
		int x;
		int y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		x = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		y = scanner.nextInt();
		
		for(int i = 1; i <= y; i++) {
			int LCM = i * x;
			if(LCM % y == 0) {
				System.out.println("LCM is: " + LCM); 
		}
	}

}
}