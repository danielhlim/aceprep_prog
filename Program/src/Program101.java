import java.util.Scanner;

public class Program101 {
	public static void main(String args[]) {
		nameCopy();
	}
	public static void nameCopy() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		String[] tokens = name.split("");
		
		for(int i=0; i<name.length(); i++) {
			System.out.println(tokens[i]);
		}
	}
}
