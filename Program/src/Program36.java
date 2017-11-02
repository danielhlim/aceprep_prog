import java.util.Scanner;

public class Program36 {
	public static void main(String args[]) {
		
		int s = 0;
		int h = 0;
		int l = 0;
		String name;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter strength (1 - 10): ");
		s = scanner.nextInt();
		
		System.out.print("Enter health (1 - 10): ");
		h = scanner.nextInt();
		
		System.out.print("Enter luck (1 - 10): ");
		l = scanner.nextInt();
		
		int total = s + h + l;
		if(total > 15) {
			System.out.println("You have given you character too many points");
			System.out.println("Default values have been assigned");
			System.out.println(name + " Strength = 5 Health = 5 Luck = 5");
		}
		
		if(total < 15) {
			System.out.println(s + " +" + h + " +" + l + " is not 15 it is " + total  );
			System.out.println("you are forced to be Strength = 5 Health = 5 Luck = 5");
		}
		
		if(total == 15) {
			System.out.println(name + " Strength = " + s + " Health = " + h + " Luck = " + l);
		}
		
	}

} 

