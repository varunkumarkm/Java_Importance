package Example_Genrics;

public class Test {

	public static void main(String[] args) {

		CreateGenericClass<String> s = new CreateGenericClass<>("Varun Kumar K M");
		s.displayObjectDetails();
		System.out.println(s.getObj());
		
		CreateGenericClass<Integer> i = new CreateGenericClass<>(91086);
		i.displayObjectDetails();
		System.out.println(i.getObj());
		
		CreateGenericClass<Double> d = new CreateGenericClass<>(122.788);
		d.displayObjectDetails();
		System.out.println(d.getObj());
	}

}
