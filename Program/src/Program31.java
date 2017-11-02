import java.util.Scanner;

public class Program31 {
	public static void main(String args[]) {
		
		int age;
		int time;
		int price = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		System.out.print("Enter the time: ");
		time = scanner.nextInt();
		
		if (age > 13 && time > 17) {
			price = 12;
		}
		
		if (age > 13 && time < 17) {
			price = 9;
		}
		
		
		if (age < 13 && time < 17) {
			price = 6;
		}
		
		if (age < 13 && time > 22) {
			System.out.println("You can't buy a ticket");
		}
		
		System.out.println("The price is: " + price);
	}

}
