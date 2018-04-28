import java.util.Scanner;

public class Program61 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Miles Per Gallon Program");
		int initial=1;
		int finalm;
		int gallon;

		int mpg;
		while(initial>0) {
			System.out.print("Initial miles: ");
			initial=scanner.nextInt();
			if(initial<0) {
				System.out.println("bye");
				System.exit(0);
			}
			System.out.print("Final miles: ");
			finalm=scanner.nextInt();
			System.out.print("Gallons: ");
			gallon=scanner.nextInt();
			mpg=(finalm-initial)/gallon;
			System.out.println("Miles per gallon = " + mpg);
		}
		
			
		}
	}

