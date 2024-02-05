package Java_9_features;

import java.util.List;
import java.util.Set;

public class ImmutableCollections {

	public static void main(String[] args) {
		List<String>  list = List.of("abc", "def", "123");
		Set<String> set = Set.of("hij", "klm", "456");
		
		list.add("varun");//java.lang.UnsupportedOperationException
		set.add("arun");//java.lang.UnsupportedOperationException
		
		System.out.println(list);
		System.out.println(set);
		
		
	}
}
 