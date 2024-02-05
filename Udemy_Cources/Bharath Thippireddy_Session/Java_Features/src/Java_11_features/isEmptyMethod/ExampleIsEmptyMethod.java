package Java_11_features.isEmptyMethod;

import java.util.Optional;

public class ExampleIsEmptyMethod {

	public static void main(String[] args) {
		Optional<String> optional = Optional.of("test");
		System.out.println(optional.isEmpty());
		
		Optional<Integer> opt = Optional.of(12);
		System.out.println(opt.isEmpty());
		
	}
}
