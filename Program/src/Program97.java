import java.util.Scanner;

public class Program97 {
	public static void main(String args[]) {
		numberDigits();
	}
	public static void numberDigits() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		if(x/1 > 0) {
			int a=x%10;
			System.out.print("1st digit is " + a);
		}
		if(x/10 > 0) {
			int b=x%100/10;
			System.out.print(", 10th digit is " + b);
		}
		if(x/100 > 0) {
			int c=x%1000/100;
			System.out.print(", 100th digit is " + c);
		}
		if(x/1000 > 0) {
			int d=x%10000/1000;
			System.out.print(", 1000th digit is " + d);
		}
	}
}
