import java.util.Scanner;

public class Program84 {
	public static void main(String args[]) {
		sumofNumbers();
	}
		public static void sumofNumbers() {
			
			int x = 0;
			
			Scanner scanner = new Scanner(System.in);
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			
			for(int i=y; i<z+1; i++) {
				x = i+i;
			}
			System.out.println(x);
		}
	}
