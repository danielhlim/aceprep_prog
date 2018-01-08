import java.util.Scanner;

public class Program61 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Miles Per Gallon Program");
		int initial;
		int finalm;
		int gallon;

		System.out.print("Initial miles: ");
		initial=scanner.nextInt();
		int mpg;
		while(initial>0) {
			System.out.print("Initial miles: ");
			initial=scanner.nextInt();
			System.out.print("Final miles: ");
			finalm=scanner.nextInt();
			System.out.print("Gallons: ");
			gallon=scanner.nextInt();
			mpg=(initial-finalm)/gallon;
			System.out.println("Miles per gallon = " + mpg);
		}
		if(initial<0) {
			System.out.
		}
			
		}
	}

