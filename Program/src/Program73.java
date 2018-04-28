public class Program73 {
	public static void main(String args[]) {
		int array[] = {5,6,6,5,8,8,8,8,5,7,5,5};
		int count[] = new int[10];
		int max = 0;
		int cnt = 0;
		for(int i=0; i<array.length; i++ ) {
			cnt = 1;
			
			for(int j=i+1; j<array.length; j++) {
				if(array[j]==array[i]) {
					cnt = cnt + 1;
					if(cnt>max) {
						max = cnt; 
					}
				}
				else {
					//count[array[i]] = cnt;
					//i = j;
					break;
				}
			}
		}
		System.out.println("8 appears consecutively " + max + " times");
	}
}
