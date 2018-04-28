import java.util.Scanner;

public class Program_75 {
	public static void main(String args[]) {
		int array[] = {1,5,9,10,13,17,22};
		
		int max = 0;
		int x;
		
		for(int i=0; i<array.length-1; i++) {
				x = Math.abs(array[i]-array[i+1]);
				if(max<x) {
					max = x;
				}
			
		}
		System.out.println("Max is :" + max);
	}
}
