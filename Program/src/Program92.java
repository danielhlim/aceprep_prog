
public class Program92 {
	public static boolean divisbleBy2(int X) {
		int x = 108;
		
		if(x%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy3(int X) {
		int x = 108;
		
		if(x%3 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy4(int X) {
		int x = 108;
		
		if(x%4 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy5(int X) {
		int x = 108;
		
		if(x%5 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy6(int X) {
		int x = 108;
		
		if(x%6 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy8(int X) {
		int x = 108;
		
		if(x%8 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean divisbleBy10(int X) {
		int x = 108;
		
		if(x%10 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		int y = 0;
		
		if(divisbleBy2(108)) {
			System.out.print("Divisible by 2");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy3(108)) {
			System.out.print(", 3");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy4(108)) {
			System.out.print(", 4");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy5(108)) {
			System.out.print(", 5");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy6(108)) {
			System.out.print(", 6");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy8(108)) {
			System.out.print(", 8");
		}
		else {
			y = y+1;
		}
		//
		if(divisbleBy10(108)) {
			System.out.print(", 10");
		}
		else {
			y = y+1;
		}
		
		
		
		
		if(y == 7) {
			System.out.println("Not divisible by any");
		}
	}
}
