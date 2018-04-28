import java.util.Scanner;

public class Program102 {
	public static void main(String args[]) {
		nameConvert();
	}
	public static void nameConvert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();
		String[] tokens = name.split(" ");
		if(tokens[0].equals("")) {
			System.exit(0);
		}
		else {
			if(tokens[0].equals("Amy") || tokens[0].equals("Buffy") || tokens[0].equals("Cathy")) {
				System.out.println("Ms. " + tokens[0] + " " + tokens[1]);
			}
			else if(tokens[0].equals("Elroy") || tokens[0].equals("Fred") || tokens[0].equals("Graham")) {
				System.out.println("Mr. " + tokens[0] + " " + tokens[1]);
			}
			else {
				System.out.println(tokens[0] + " " + tokens[1]);
			}
		}  
		scanner.close();
	}
}
