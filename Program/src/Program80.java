
public class Program80 {
	
	public static void main(String args[]) {
		patternX();
	}
	public static void patternX() {
		
		int x = 3;
		
		for(int i=0; i<3; i++) {
			System.out.println("*"); 
			
			for(int j=0; j<x; j++) {
				System.out.print("*"); 
			}
			
			x = x+4; 
			System.out.println();  
		}
	}
}
