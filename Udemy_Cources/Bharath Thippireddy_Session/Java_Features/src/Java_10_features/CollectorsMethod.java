package Java_10_features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMethod {

	public static void main(String[] args) {
		List<Integer> list = List.of(15, 20, 17, 30);
		
		List<Integer> newList = list.stream().filter(i -> i%3==0).collect(Collectors.toUnmodifiableList());
		
		newList.add(40);//java.lang.UnsupportedOperationException
		
		System.out.println(newList);
	}
}
