package SynchronizedBlockExample;

public class MainClass {

	public static void main(String[] args) {
		ExampleSynchronizedBlock syncBlock = new ExampleSynchronizedBlock();
		
		ThreadClass threadClass = new ThreadClass(syncBlock, "Thread 1");
		ThreadClass threadClass1 = new ThreadClass(syncBlock, "Thread 2");
		
		threadClass.start();
		threadClass1.start();
	}
}
