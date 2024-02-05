package FindAFactorial;

//we do the two way to find the factorial number 1) Recursive way and 2) non-recursive way

// 1) Recursive way
   class ExampleRecursiveWay {

	 public static int recursiveFactorial(int num) {
		if(num == 0) {
			return 1;
		}else {
			return (num*recursiveFactorial(num-1));
		}
	 }
	 
	 public static void main(String[] args) {
		System.out.println(ExampleRecursiveWay.recursiveFactorial(5));
	}
}
   

// 2) non-recursive way
  class ExampleNonRecursiveWay {

	 public static int findFactorial(int number) {
		 int result = 1;
		 
		 for (int i = 1; i <= number; i++) {
			result = result*i;
		}
		 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(ExampleNonRecursiveWay.findFactorial(5));
	}
 }
 
	 
	 