import java.util.Scanner;

public class Program88 {
	public static void main(String args[]) {
		boolean x;
		x = inBetween();
	}
	public static boolean inBetween(){
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		
		if(54<y && y<154) {
			System.out.println("between");
		}
		else {
			System.out.println("not in between");
		}
		return false;
	}
}
