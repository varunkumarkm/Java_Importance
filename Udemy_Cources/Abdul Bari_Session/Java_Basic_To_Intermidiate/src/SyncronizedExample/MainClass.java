package SyncronizedExample;

public class MainClass {

	public static void main(String[] args) {
		
		ExampleSyncronization exampleSync = new ExampleSyncronization();
		
		ThreadClass thclass = new ThreadClass(exampleSync, "This is first thread");
		ThreadClass thclass1 = new ThreadClass(exampleSync, "After This is second thread");
		
		thclass.start();
		thclass1.start();
	}
}
