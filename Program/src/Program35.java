import java.util.Scanner;

public class Program35 {
	public static void main(String args[]) {
		
		int item;
		int time;
		int Ttime;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the items :");
		item = scanner.nextInt();
		
		System.out.print("Enter the single item heating time: ");
		time = scanner.nextInt();
		
		if (item == 1) {
			Ttime = time;
			System.out.println("Recommanded time: " + Ttime);
		}
		
		if (item == 2) {
			Ttime = time + time/2;
			System.out.println("Recommanded time: " + Ttime);
		}
		
		if (item == 3) {
			Ttime = time * 2;
			System.out.println("Recommanded time: " + Ttime);
		}
		
		if (item > 3) {
			System.out.println("Not recommanded");
		}
	}

}
