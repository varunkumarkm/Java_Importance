package Java_8_features_Predicate;

import java.util.function.Predicate;

 class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> pre = i-> i>20;
		
		System.out.println(pre.test(15));
		System.out.println(pre.test(24));
		System.out.println(pre.test(30));
	}
}
 class PredicateString {

		public static void main(String[] args) {
			Predicate<String> preString = s ->(s.length()>5);
			
			System.out.println(preString.test("varun"));
			System.out.println(preString.test("kumar K M"));
			System.out.println(preString.test("xxyx"));
		}
	}
