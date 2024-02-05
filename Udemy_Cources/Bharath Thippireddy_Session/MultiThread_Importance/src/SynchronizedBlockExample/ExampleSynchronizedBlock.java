package SynchronizedBlockExample;

public class ExampleSynchronizedBlock {

	public void sayHello(String name) {
		
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("How are you :" +name);
				
				try {
					Thread.sleep(2000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
