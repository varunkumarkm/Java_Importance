package FebonacchiSeriesExample;

public class ExpFebanacchi {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int fiba;
		
		System.out.println(num1 + " " + num2);
		
		int count = 10;
		
		for (int i = 0; i < count; i++) {
			
			fiba = num1+num2;
			
			System.out.println(" " + fiba);
			
			num1 = num2;
			num2 = fiba;
		}
	}
}
