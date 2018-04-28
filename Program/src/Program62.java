
import java.util.Scanner;

public class Program62 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int c=1;
		int d = 0;
		int e = 0;
		System.out.print("Low end of range: ");
		a=scanner.nextInt();
		System.out.print("High end or range: ");
		b=scanner.nextInt();
		
		while(c!=0) {
			System.out.print("Enter data: ");
			c=scanner.nextInt();
			if(c>a && c<b) {
				d=c+c;
			}
			else {
				e=c+c;
			}
			
			if(c==0) {
				System.out.println("Sum of in range values: " + d);
				System.out.println("Sum of out of range values: " + e);
			}
			
		}
		
	}
}
