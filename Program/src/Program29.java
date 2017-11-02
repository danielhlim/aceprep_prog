import java.util.Scanner;

public class Program29 {
	public static void main(String args[]) {
		double v;
		int temp;
		double WCI;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter temp: ");
		temp = scanner.nextInt();
		
		System.out.print("Enter wind speed: ");
		v = scanner.nextDouble();
		
		if(0 <= v && v<=4) {
			WCI = temp;
			
		}
		
		if(v>= 45) {
			WCI = 1.6 * temp - 55;
			
		}
		
		else {
			WCI = 91.4 + (91.4 - temp) * (0.0203 * temp - 0.304/2 - 0.474);
			
		}
		System.out.println("WCI: " + WCI);

	}
	

}
