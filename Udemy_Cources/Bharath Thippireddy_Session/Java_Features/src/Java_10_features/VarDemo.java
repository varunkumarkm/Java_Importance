package Java_10_features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class VarDemo {

	public static void main(String[] args) {
		var var = 10;
		System.out.println(var);
		
		var map = new HashMap<String, List<String>>();
		
		for (var entry : map.entrySet()) {
			var value = entry.getValue();
		}
		
		Consumer<Integer> l = (i) -> {
			var z = 10;
			System.out.println(i);
		};
		
		var list = new ArrayList<Integer>();
		list.add(123);
		System.out.println(list);
	}
}
