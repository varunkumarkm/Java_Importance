package DurgaSoft;

import java.util.Iterator;

class Threads {
    //Without lambda expression
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child thread");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
}
  class LambdaThread {
	  //With lambda expression
	  public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
  }
  
  class NoRunnable {
	  public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
  }
  
  
 
      
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  