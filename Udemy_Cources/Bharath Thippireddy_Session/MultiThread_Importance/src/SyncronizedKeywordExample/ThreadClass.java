package SyncronizedKeywordExample;

public class ThreadClass extends Thread {

	SyncronizationExample synExample;
	String name;
	
	public ThreadClass(SyncronizationExample synExample, String name) {
		this.synExample = synExample;
		this.name = name;
	}
	public void run() {
		synExample.sayHello(name);
	}
}
