package Java_8_features.LamdaExpression;

public class Test {

	public static void main(String[] args) {
//		Runnable runnable = new ExampleLamdaExpression();
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		Runnable runnable = () -> {
		
			for (int i = 0; i <=10; i++) {
				System.out.println("Child Thread");
		    }
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		for (int i = 0; i <=10; i++) {
			System.out.println("Main thread");
		}
	}
}
