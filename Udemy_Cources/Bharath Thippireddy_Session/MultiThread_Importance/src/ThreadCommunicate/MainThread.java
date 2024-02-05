package ThreadCommunicate;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		synchronized (myThread) {
			System.out.println("Main thread is going to wait");
			myThread.wait();
			System.out.println("Main thread notified");
			System.out.println(myThread.total);
		}
	}
}
