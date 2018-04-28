import java.util.Scanner;

public class Program72_ {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many integers?");
		int x = scanner.nextInt();
		int ini[] = new int [x];
		int result[] = new int[9];
		
		for(int i = 0; i < 3; i++) {
			ini[i]=scanner.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			result[ini[i]]++;
		}
		
		int max = result[0];
		int maxindex = 0;
		
		for(int i = 1; i<result.length; i++) {
			if(result[i]>max) {
				max = result[i];
				maxindex = i;
			}
		}
		System.out.println("The most frequent number is "+ maxindex);
	}
}