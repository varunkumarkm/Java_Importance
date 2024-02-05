package Java_12_features.StringApiUpdate;

public class StringApiUpdate {

	public static void main(String[] args) {
		
		String str = "All the power is in your hand you can utlize that power";
		System.out.println(str);
		System.out.println("After Indentation : " + str.indent(5));
		System.out.println("Negative Indentation :" + str.indent(-4));
		
		String s1 = "10";
		Integer integer = s1.transform(Integer::parseInt);
		System.out.println(integer);
	}
}
