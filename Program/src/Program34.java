import java.util.Scanner;

public class Program34 {
	public static void main(String args[]) {
		
		double e;
		double Tair;
		double Tsteam;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter air temp: ");
		Tair = scanner.nextDouble();
		
		System.out.print("Enter steam temp: "); 
		Tsteam = scanner.nextInt();
		
		if (Tsteam < 373) {
			e = 0;
		}
		
		else {
			e = 1 - Tair / Tsteam;
		}
		
		System.out.println("Efficiency = " + e);
	}

}
