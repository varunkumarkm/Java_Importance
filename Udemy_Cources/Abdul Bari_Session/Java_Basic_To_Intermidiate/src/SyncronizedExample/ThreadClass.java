package SyncronizedExample;

public class ThreadClass extends Thread{

	ExampleSyncronization examplesync;
	String name;
	
	public ThreadClass(ExampleSyncronization examplesync, String name) {
		this.examplesync = examplesync;
		this.name = name;
	}
	
	public void run() {
		examplesync.giveResponse(name);
	}
	
}
