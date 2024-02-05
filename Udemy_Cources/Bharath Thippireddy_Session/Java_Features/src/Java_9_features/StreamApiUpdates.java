package Java_9_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 class StreamApiUpdates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 32, 11, 46, 30, null);
		
		//System.out.println(list.stream().filter(x-> x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().takeWhile(x-> x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().dropWhile(x-> x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()));
	}
}

  class FlatMapExample {
	  
     public static void main(String[] args) {
         List<String> words = Arrays.asList("Hello", "World");

         // Using flatMap to split each word into its individual letters
         List<String> letters = words.stream().flatMap(word -> Arrays.stream(word.split("")))
        		 .collect(Collectors.toList());

         System.out.println(letters);
     }
 }
