package Java_8_features_Predicate;

import java.util.function.Predicate;

public class PredicateJoinsExample {

	public static void main(String[] args) {
		
		int [] x = {0,8,9,6,23,7,34,12,90,50,30};
		 
		Predicate<Integer> pre1 = i-> i>10;
		Predicate<Integer> pre2 = i-> i%2 == 0;
		
		System.out.println("Grater than 10:");
		method1(pre1,x);
		
		System.out.println("Even Numbers:");
		method1(pre2,x);
		
		System.out.println("Not greter than 10:");
		method1(pre1.negate(), x);
		
		System.out.println("Grater than 10 and even:");
		method1(pre1.and(pre2), x);
		
		System.out.println("Grater than 10 or even:");
		method1(pre1.or(pre2), x);
	}

	private static void method1(Predicate<Integer> pre1, int[] x) {
		for (int eachValue : x) {
			if(pre1.test(eachValue))
			System.out.println(eachValue);
		}
	}
}
