import java.util.ArrayList;
import java.util.Collections;
public class Program77 {
	public static void main(String a[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("Cric");
		list.add("Play");
		list.add("Glass");
		Collections.reverse(list);
		System.out.println("Results after reverse operation: ");
		for(String str: list) {
			System.out.println(str);
		}
	}
}
