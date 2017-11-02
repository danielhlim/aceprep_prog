import java.util.Scanner;

public class Program40 {
	public static void main(String args[]) {
		int fr;
		int fl;
		int br;
		int bl;
		int x;
		int y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input right front pressure: ");
		fr = scanner.nextInt();
		
		System.out.print("Input left front pressure: ");
		fl = scanner.nextInt();
		
		System.out.print("Input right rear pressure: ");
		br = scanner.nextInt();
		
		System.out.print("Input left rear pressure: ");
		bl = scanner.nextInt();
		
		System.out.println("Inflation BAD");
	}
}