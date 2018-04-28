import java.util.Scanner;

public class Program86 {
	public static void main(String args[]) {
		patternX();
	}
	public static void patternX() {
		Scanner scanner = new Scanner(System.in);
		int x = 3;
		
		int y = scanner.nextInt();
		for(int i=0; i<y; i++) {
		for(int j=0; j<3; i++) {
			System.out.println("*"); 
			
			for(int j1=0; j1<x; j1++) {
				System.out.print("*"); 
			}
			
			x = x+4; 
			System.out.println();
			}
		}
	}
}
