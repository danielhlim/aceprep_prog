import java.util.Scanner;

public class Program53 {
	public static void main(String ars[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hours: ");
		int h = scanner.nextInt();
		System.out.print("Zones: ");
		int z = scanner.nextInt();
		System.out.print("Depart: ");
		int d = scanner.nextInt();
		System.out.print("Arrive: ");
		int a = scanner.nextInt();
		
		double r = (h/2 + (z-3) + d + a)/10;
		System.out.println("days of recovery: " + r + "days");
	}
}
