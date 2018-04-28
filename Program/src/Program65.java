import java.util.Scanner;

public class Program65 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String id = "";
		String pw = "";
		
		while(id.equals("exit") == false && pw.equals("quit") == false) {
			
			System.out.print("User Name: ");
			id = scanner.nextLine();
			System.out.print("Password: ");
			pw = scanner.nextLine();
			
			if(id.equals("gates")) {
				if(pw.equals("monopoly")) {
					System.out.println("You have logged on with priority 1");
				}
				else {
					System.out.println("Log in failed");
				}
			}
			
			if(id.equals("joy")) {
				if(pw.equals("sun")) {
					System.out.println("You have logged on with priority 4");
				}
				else {
					System.out.println("Log in failed");
				}
			}
			
			if(id.equals("jobs")) {
				if(pw.equals("apple")) {
					System.out.println("You have logged on with priority 3");
				}
			}
			
			if(id.equals("root")) {
				if(pw.equals("secret")) {
					System.out.println("You have logged on with priority 5");
				}
				else {
					System.out.println("Log in failed");
				}
			}
			if(id.equals("quit")== true && pw.equals("exit")== true) {
				System.out.println("Bye");
			}
		}
	}
}
