import java.util.Scanner;

public class Program100 {
	public static void main(String args[]) {
		nameConvert();
	}
	public static void nameConvert() {
		Scanner scanner = new Scanner(System.in);
		String fullname = scanner.nextLine();
		
		String[] tokens = fullname.split(" ");
		String firstname = tokens[0];
		System.out.print(firstname);
		
		String lastname = tokens[1];
		lastname = lastname.toUpperCase();
		System.out.println(" " + lastname);
		
		scanner.close();
	}
}
