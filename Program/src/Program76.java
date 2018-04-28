import java.util.ArrayList;
import java.util.Collections;
public class Program76 {
	
	public static void main(String a[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		
		Collections.swap(list, 2, 5);
		System.out.println("Results after swap operation: ");
		for(String star: list) {
			System.out.println(star);
		}
	}
}
