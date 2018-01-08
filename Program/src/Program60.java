import java.util.Scanner;

public class Program60 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer(enter 0 to quit): ");
		int y=scanner.nextInt();
		if(y==0) {
			System.out.println("No integers were entered.");
			System.out.println("bye");
		}
		
		else {
			System.out.print("Enter an integer: ");
			int x=scanner.nextInt();
			
			while(x!=0) {
				System.out.print("Enter an integer: ");
				x=scanner.nextInt();
				x=x+x;
			}
			if(x==0) {
				System.out.println("Sum of the integers: " + x);
				System.out.println("bye");
			}
		}
	}
}
