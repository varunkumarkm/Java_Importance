package DurgaSoft;

//Without using lambda expression

 class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
 }
  class ThreadDemo {
	  public static void main(String[] args) {
		
		  Runnable r = new MyRunnable();
		  
		  Thread t = new Thread(r);
		  t.start();
		  
		  for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
  }
  
  //With using lambda expression
  
  class ThreadExp {
	  
	  public static void main(String[] args) {
		
		  Runnable r = () -> {
			  for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		  };
		  Thread t = new Thread(r);
		  t.start();
		  for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  