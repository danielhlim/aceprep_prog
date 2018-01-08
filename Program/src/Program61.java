import java.util.Scanner;

public class Program61 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Miles Per Gallon Program");
		int initial;
		int finalm;
		int gallon;
		int mpg;
		int a;
		int b;
		System.out.print("Initial miles: ");
		initial=scanner.nextInt();
		if(initial<0) {
			System.out.println("bye");
			scanner.close();
		}
		else {
			System.out.print("Final miles: ");
			finalm=scanner.nextInt();
			System.out.print("Gallons: ");
			gallon=scanner.nextInt();
			a=finalm-initial;
			mpg=a/gallon;
			System.out.println("Miles per Gallon: " + mpg);
			
			}
			
		}
	}

