package Java_8_features_FunctionExample;

import java.util.function.Function;

public class ExampleFunction {

	public static void main(String[] args) {
		Function<String, Integer> fun = s->s.length();
		
		System.out.println(fun.apply("Bharath"));
		System.out.println(fun.apply("Sharath"));
		System.out.println(fun.apply("Janardhan"));
	}
}
