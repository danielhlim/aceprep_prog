import java.util.Scanner;

public class Program71 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many strings?: ");
		int x = scanner.nextInt();
		String temp;
		String[] ar = new String[x];
		
		Scanner scanner2 = new Scanner(System.in);
		
		for(int i = 0; i<x; i++) {
			ar[i] = scanner2.nextLine();
		}
		
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[j].compareTo(ar[i]) < 0) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
