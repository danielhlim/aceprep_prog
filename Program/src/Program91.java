
public class Program91 {
	
	public static boolean divisbleBy2(int X) {
		int x = 132;
		
		if(x%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy3(int X) {
		int x = 132;
		
		if(x%3 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy4(int X) {
		int x = 132;
		
		if(x%4 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy5(int X) {
		int x = 132;
		
		if(x%5 == 0) {
			return true;
		}
		return false;
	}
	
	//
	
	
	public static void main(String args[]) {
		int y = 0;
		
		if(divisbleBy2(132)) {
			System.out.print("Divisible by 2");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy3(132)) {
			System.out.print(", 3");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy4(132)) {
			System.out.print(", 4");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy5(132)) {
			System.out.print(", 5");
		}
		else {
			y = y+1;
		}
		
		if(y == 4) {
			System.out.println("Not divisible by any");
		}
	}
}
