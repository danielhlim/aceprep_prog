import java.util.Scanner;

public class Program87 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		String letter = scanner.nextLine();
		convert(letter.charAt(0));
		scanner.close();
		}
	public static void convert(char x) {
		
		switch(x) {
		case 'A':
			System.out.println("1");
			break;
		case 'b':
			System.out.println("2");
			break;
		case 'c':
			System.out.println("3");
			break;
		case 'd': 
			System.out.println("4");
			break;
		case 'e':
			System.out.println("5");
			break;
		}
	}
}

