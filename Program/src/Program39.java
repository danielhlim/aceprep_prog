import java.util.Scanner;

public class Program39 {
	public static void main(String args[]) {
		int fr;
		int fl;
		int br;
		int bl;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input right front pressure: ");
		fr = scanner.nextInt();
		
		if(fr > 35 && fr < 45) {
			System.out.println("Inflation is ok");
		}
		
		else {
			System.out.println("Warning: pressure is out of range");
		}
		
		System.out.print("Input left front pressure: ");
		fl = scanner.nextInt();
		
		if(fl > 35 && fl < 45) {
			System.out.println("Inflation is ok");
		}
		else {
			System.out.println("Warning: pressure is out of range");
		}
		
		System.out.print("Input right rear pressure: ");
		br = scanner.nextInt();
		
		if(br > 35 && br < 45) {
			System.out.println("Inflation is ok");
		}
		else {
			System.out.println("Warning: pressure is out of range");
		}
		
		System.out.print("Input left rear pressure: ");
		bl = scanner.nextInt();
		
		if(bl > 35 && bl < 45) {
			System.out.println("Inflation is ok");
		}
		else {
			System.out.println("Warning: pressure is out of range");
		
		
		if(fr > 35 && fr < 45 && fl > 35 && fl < 45 && br > 35 && br < 45 && bl > 35 && bl < 45) {
			System.out.println("Inflation is ok");
		}
		
		else {
			System.out.println("Inflation is BAD");
		}
		
		System.out.println("YOU SUCK");

}
}
}
