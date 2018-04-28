
public class Program85 {
	public static void main(String args[]) {
		isPrime();
	}
	public static void isPrime() {
		boolean isprime = true;
		for(int i=101; i<201; i++) {
			
			for(int j=2; j<i/2; j++) {
				if(i%j == 0) {
					isprime = false;
				}
			}
			if(isprime) {
				System.out.println(i);
			}
			isprime = true;
		}
	}
}
