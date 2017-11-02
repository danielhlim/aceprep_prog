import java.util.Scanner;

public class Program38 {
	public static void main(String args[]) {
		int fr;
		int fl;
		int br;
		int bl;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input right front pressure: ");
		fr = scanner.nextInt();
		
		System.out.print("Input left front pressure: ");
		fl = scanner.nextInt();
		
		System.out.print("Input right rear pressure: ");
		br = scanner.nextInt();
		
		System.out.print("Input left rear pressure: ");
		bl = scanner.nextInt();
		
		if(fr == fl && br == bl) {
			System.out.println("Inflation is OK");
		}
		
		else {
			System.out.println("Inflation not OK");
		}
		}

}
