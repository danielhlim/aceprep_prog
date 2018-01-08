import java.util.Scanner;

public class Program59 {
	public static void main(String args[]) {
		int n, c, fact = 1;
		 
	      System.out.print("Enter an integer: ");
	      Scanner in = new Scanner(System.in);
	 
	      n = in.nextInt();
	 
	         for ( c = 1 ; c <= n ; c++ ) {
	            fact = fact*c;
	         }
	       
	       //
	       int fact2 = 1;
	       for( c=1; c<=n-1; c++) {
	    	   fact2=fact2*c;
	       }
	       
	       int f;
	       f=fact/fact2;
	       System.out.println(f);
	       
	      }
	}

