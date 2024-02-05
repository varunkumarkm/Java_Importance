package MultiThreadExample;

//How to create a Thread.

//What are different ways in which thread can be created
//There are two different ways in which thread can be created 
//1) our class will extends a Thread class and override the run method.
//within create a Thread class and invoke a start() method on it.

 class CreatingThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		CreatingThread mt = new CreatingThread();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();
		
		CreatingThread mt1 = new CreatingThread();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
	}
	public void run() {
		System.out.println("Thread Name :" + Thread.currentThread().getName());
	}
}

// Another way to create a thread
 
//2) The second way implement the Runnable interface, instead of extends the Thread class Because it uses the Capability 
//of extending the any other java class if required, In case of extending a Thread class we cannot extend any other class
//If required in our other application, Because java does not support multi class level inheritance
 
  class CheckProcessor implements Runnable {

		@Override
		public void run() {
	      System.out.println("Process the checks");		
		}
	    public static void main(String[] args) {
	    	CheckProcessor checkProcessor = new CheckProcessor();
	    	Thread thread = new Thread(checkProcessor);
	    	thread.start();
		}
	}
  
  
  
  
  
  
  
  