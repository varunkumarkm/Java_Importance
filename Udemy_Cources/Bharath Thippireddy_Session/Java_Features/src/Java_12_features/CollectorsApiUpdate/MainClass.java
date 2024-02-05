package Java_12_features.CollectorsApiUpdate;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MainClass {

	public static void main(String[] args) {
		Result result = Stream.of(2, 10, 8 , 20, 14, 6, 68, 26, 75).collect(Collectors.
				teeing(Collectors.counting(), Collectors.filtering(n->Integer.parseInt(n.toString())>10,
						Collectors.toList()), Result::new));
		System.out.println(result);
		
	}
}
