package Java_13_and_14_features.InstanceOfPatternMatching;

class ExampleOfInstanceOfPatternMatching {

	public static void main(String[] args) {
		Object object = get();
		if(object instanceof String) {
			String str = (String)object;
			System.out.println(str);
		}
	}

	private static Object get() {
		return "Pattern matchning in action";
	}
}

// Starting java 14 we don't want to write so much code, it is very easy instanceOf operator does the all magic 
// for us.

		class ExampleOfInstanceOfPatternMatchings {
		
			public static void main(String[] args) {
				Object object = get();
				if(object instanceof String str) {
					System.out.println(str);
				}
			}
		
			private static Object get() {
				return "Pattern matchning in action";
			}
		}