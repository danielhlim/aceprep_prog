import java.util.Scanner;

public class Program81 {
	public static void main(String args[]) {
		convert();
	}
	public static void convert() {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<12; i++) {
			String x = null;
			x = scanner.nextLine();
			if(x.equals("a")==true) {
				System.out.print("1");
			}
			else if(x.equals("b")) { 
				System.out.print("2");
			}
			else if(x.equals("c")==true) {
				System.out.print("3");
			}
			else if(x.equals("d")==true) {
				System.out.print("4");
			}
			else if(x.equals("e")==true) {
				System.out.print("5");
			}
			else if(x.equals("f")==true) {
				System.out.print("6");
			}
		}
	}
}
