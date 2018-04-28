import java.util.Scanner;

public class Program103 {
	public static void main(String args[]) {
		microwaveTime();
	}
	public static void microwaveTime() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter cook time-> ");
		String num = scanner.nextLine();
		
		if(num.length() == 2) {
			int z = Integer.parseInt(num);
			System.out.println("Your time-> " + "0:" + z);
		}
		if(num.length() == 3) {
			int x = Integer.parseInt(num);
			System.out.println("Your time-> " + x/100 + ":" + x%100);
		}
		if(num.length() == 4) {
			int y = Integer.parseInt(num);
			System.out.println("Your time-> " + y/100 + ":" + y%100);
		}
		scanner.close();
	}
}
