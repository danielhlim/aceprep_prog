
public class Program95 {
	public static void main(String args[]) {
		fibonacci();
	}
	public static void fibonacci() {
		int x = 1;
		int y = 1;
		int z = 0;
		
		System.out.print(x + ", " + y);
		for(int i=0; i<10; i++) {
			z = y+x;
			System.out.print(" ," + z);
			
			x = y;
			y = z;
		}
	}
}










//fibonacci prog