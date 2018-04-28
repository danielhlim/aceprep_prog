
import java.util.Scanner;

public class Program94 {
	 
	public static void main(String args[]) {
		 
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		str.trim();
		
		String[] tokens = str.split("[ =]");
		 
		String strNum = tokens[1];
		String strX = tokens[3];
		int num = Integer.parseInt(strNum);
		int x = Integer.parseInt(strX);
		 
		Program94.isDivisible(num, x);
		scanner.close();
		 
	 }
	 
	 public static boolean isDivisible(int num, int x) {
		 		 
		 if(num%x == 0) {
			 System.out.println(num + " is divisible by " + x);
			 return true;
		 }
		 else {
			 System.out.println(num + " is not divisible by " + x);
			 return false;
		 }
		 
		
		 
	 }
}
//isDivisibleBy final