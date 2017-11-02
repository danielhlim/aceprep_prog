import java.util.Scanner;

public class Program46 {
	public static void main(String args[]) {
		int s;
		int e;
		int n = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Start: ");
		s = scanner.nextInt();
		
		System.out.print("Enter End: ");
		e = scanner.nextInt();
		
		for (int i = s; i < e +1; i ++) {
			System.out.println(i);
		}
	}
}
