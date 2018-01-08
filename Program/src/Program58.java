import java.util.Scanner;

public class Program58 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the dimension of the room: ");
		int a = scanner.nextInt();
		
		System.out.print("enter the number of openings: ");
		int o = scanner.nextInt();
		int y =0;
		for(int i=0; i<o; i++) {
			System.out.print("Enter the area of the opening: ");
			int x=scanner.nextInt();
			y = y + x;
		}
		double z=a-y;
		double w=z/972;
		
		System.out.println("you need "+w +"rolls");
	}

}
