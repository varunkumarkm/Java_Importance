package SynchronizedBlockExample;

public class ThreadClass extends Thread {
	
	ExampleSynchronizedBlock syncBlock;
	String name;
	
	
	public ThreadClass(ExampleSynchronizedBlock syncBlock, String name) {
		this.syncBlock = syncBlock;
		this.name = name;
		
		syncBlock.sayHello(name);
	}

}
