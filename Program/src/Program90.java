
public class Program90 {
	
	
	public static boolean myAgeIs (int X) {
		int current = 1;
		System.out.println("My age is " + current + " !");
		System.out.println("My age after " + X + " years is " + (current + X) + " !");
		if(current + X > 13) {
			return true;
		}
			
		return false;
	}
	
	
	public static void main(String args[]) {
		boolean greater13 = myAgeIs(5);
		if(greater13) {
			System.out.println("My age is greater than 13");
		}
		else {
			System.out.println("My age is NOT greater than 13");
		}
		
		
	}
}

