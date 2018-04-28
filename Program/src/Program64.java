import java.util.Scanner;

public class Program64 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int x;
		int ix;
		int y;
		int iy;
		int a=0;
		int b=0;
		int width=1;
		int height=1;
		int area=1;
		
		while(area != 0) {
			
			width=0;
			height=0;
			area=0;
			
			System.out.print("First corner X coordinate: ");
			x=scanner.nextInt();
			System.out.print("First corner Y coordinate: ");
			y = scanner.nextInt();
			System.out.print("Second corner X coordinate: ");
			ix = scanner.nextInt();
			System.out.print("Second corner Y coordinate: ");
			iy = scanner.nextInt();
			
			if(x-ix>=0) {
				a = x-ix;
				width=a;
				System.out.print("width: "+width);
			}
			else if(ix-x>0) {
				b = ix-x;
				width=b;
				System.out.print("width: "+width);
			}
			
			if(y-iy>=0) {
				height=y-iy;
				System.out.print("  height: "+height);
			}
			else if(iy-y>0) {
				height=iy-y;
				System.out.print("  height: "+height);
			}
			area=height*width;
			System.out.println("  Area: "+area);
		}
		
		System.out.println("finished");
	}
}
