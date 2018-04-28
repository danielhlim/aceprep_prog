
public class Program67 {
	public static void main(String args[]) {
		int month = 0;
		double effect=100;
		
		while(effect>50) {
			month++;
			effect=effect * 0.96;
			System.out.println("month: " + month + "effectiveness: " + effect);
			if(effect<50) {
				System.out.println("month: " + month + "effectiveness: " + effect + " DISCARDED");
			}
		}
		
	}
}
