import java.util.Scanner;

public class Program37 {
	public static void main(String args[]) {
		
		int check;
		int save;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your checking account: ");
		check = scanner.nextInt();
		
		System.out.print("Enter you saving account: ");
		save = scanner.nextInt();
		
		if(check > 1000 && save > 1500) {
			System.out.println("0 fee");
		}
		
		else {
			System.out.println("$0.15 fee");
		}
	}

}
