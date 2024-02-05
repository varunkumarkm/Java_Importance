package Java_8_features_StreamsExample;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(); 
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		
		 List<Integer> l2 = l1.stream().filter(s-> s%2==0).collect(Collectors.toList());
		 System.out.println(l2);
		 
		 //Some another method also available for Stream are:
		 long count = l1.stream().filter(i-> i%2==0).count();
		 System.out.println("Number of even numbers are:"+ count);
		 
		 Comparator<Integer> comp = (i1, i2)-> i1.compareTo(i2);
		 
		 List<Integer> l3 = l1.stream().sorted(comp).collect(Collectors.toList());
		 System.out.println(l3);
		 
		 Integer max = l1.stream().max(comp).get();
		 System.out.println(max);
		 
		 Integer min = l1.stream().min(comp).get();
		 System.out.println(min);
		 
		 l1.stream().forEach(i-> System.out.println(i));
	}
}
