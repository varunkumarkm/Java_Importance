package SyncronizedExample;

public class ExampleSyncronization {

	public synchronized void giveResponse(String response) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Please give a proper response :" + response);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
