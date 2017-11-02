import java.util.Scanner;

public class Program23 {
	public static void main(String args[]) {
		
		int x;
		int a;
		int b;
		int c;
		int d;
		int sum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter 4 numbers: ");
		x = scanner.nextInt();
		
		a = x % 10;
		b = (x % 100)/10;
		c = (x % 1000)/100;
		d = (x % 10000)/1000;
		
		sum = a + b + c + d;
		
		System.out.println("if x = " + x + " ,sum is: " + sum );
		
		
	}

}
