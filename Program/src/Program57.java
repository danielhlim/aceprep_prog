
public class Program57 {
	public static void main(String args[]) {
		
		for(int l=0; l<8; l++) {
			
			for(int s=0; s<7-l; s++) {
				System.out.print(" ");
			}
			
			for(int st=0; st<1+2*l; st++) {
				System.out.print("*");
			}
		
			System.out.print("\n");
			
			
		}
		
		for(int l2=0; l2<3; l2++) {
			System.out.println("      ***      ");
		}
	}
}	

