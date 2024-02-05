package Java_8_features_StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("varun");
		list.add("tarun");
		list.add("ramesh");
		list.add("Kumar");
		
		System.out.println(list);
		
		List<String> collectStr = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(collectStr);
	}
}
