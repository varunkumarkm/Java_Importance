package Java_9_features;


class ExampleRecursiveWay {

	 public static int findFactorial(int number) {
		 int fact = 1;
		 
		 for (int i = 1; i <= number; i++) {
			 fact = fact*i;
		}
		 return fact;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(ExampleRecursiveWay.findFactorial(10));
	}
}

