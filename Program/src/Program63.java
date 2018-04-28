import java.util.Scanner;
public class Program63 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int weight = 1;
		double cost = 0;
		
		while(weight!=0) {
			System.out.print("Weight of Order: ");
			weight=scanner.nextInt();
			if(weight==0) {
				System.out.println("bye");
				System.exit(0);
			}
			if(weight<=10) {
				cost = 3;
				System.out.println("Shipping Cost: $" + cost);
			}
			else {
				cost = 3+((weight-10)*0.25);
				System.out.println("Shipping Cost: $" + cost);
			}
		}
	}
}
