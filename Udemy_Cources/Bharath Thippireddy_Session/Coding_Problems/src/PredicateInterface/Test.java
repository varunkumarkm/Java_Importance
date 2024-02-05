package PredicateInterface;

import java.util.function.Predicate;

class Test {

	public static void main(String[] args) {
		
		String [] names = {"varun", "kiran", "kishor", "kumar", "anil", "raj"};
		
		Predicate<String> startsWithK = s -> s.charAt(0) == 'k';
		
		System.out.println("The starts with k are: ");
		
		for (String s : names) {
			if(startsWithK.test(s)) {
				System.out.println(s);
			}
		}
	}
}
//The starts with k are: 
//kiran
//kishor
//kumar






















