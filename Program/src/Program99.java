import java.util.Scanner;

public class Program99 {
	public static void main(String args[]) {
		numberSequence();
	}
	public static void numberSequence() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int a = 0;
		
		for(int i=1; i<12; i++) {
			a = x*i;
			System.out.print(a + " ");
		}
	}
}
