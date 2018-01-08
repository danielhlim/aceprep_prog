import java.util.Scanner;

public class Program33 {
	public static void main(String args[]) {
		
		String item;
		double price;
		double shipping = 0;
		double total = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the item: ");
		item =scanner.nextLine();
		
		System.out.print("Enter the price: ");
		price = scanner.nextDouble();
		
		if (price < 10) {
			shipping = 2;
		}
		
		if (price > 10) {
			shipping = 3;
		}
		
		total = price + shipping;
		
		System.out.println(item + " " + price);
		System.out.println("shipping " + shipping);
		System.out.println("Total " + total);
		//you are a loser
		
	}

}
