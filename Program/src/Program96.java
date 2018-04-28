import java.util.Scanner;

public class Program96 {
	public static void main(String args[]) {
		sumOfDigits();
	}
	public static void sumOfDigits() {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		int a=x%10;
		//System.out.println(a);
		int b=x%100/10;
		//System.out.println(b);
		int c=x%1000/100;
		//System.out.println(c);
		int d=x%10000/1000;
		//System.out.println(d);
		int e=x%100000/10000;
		//System.out.println(e);
		System.out.println(a+b+c+d+e);
	}
}
