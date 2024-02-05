package Java_8_features.DefaultMethodsExample;

public interface A {

	void m();
	
	default void m1() {
		System.out.println("m1 inside A");
	}
}
