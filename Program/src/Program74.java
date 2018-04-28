import java.util.Scanner;

public class Program74 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] s = input.split(" ");
		
		int max = 0;
		int x;
		String y = null;
		
		for(int i=0; i<s.length; i++) {
			x = s[i].length();
			if(x>max) {
				max = x; 
				y = s[i];
			}
		}
		System.out.println(y + " is the longest string with "+ max + " characters");
	}
}
