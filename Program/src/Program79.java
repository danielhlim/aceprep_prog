
public class Program79 {
	public static void main(String args[]) {
		primeNumbers();
	}
	public static void primeNumbers() {
		boolean isprime = true;
		for(int i=27; i<108; i++) {
			
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
