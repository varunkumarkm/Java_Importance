package DurgaSoft;

 interface DefaultInt {

	 default void m1(){
		 System.out.println("default method");
	 }
}
  //Default implementation
 class Check implements DefaultInt {
	 public static void main(String[] args) {
		 Check c = new Check();
		 c.m1();
	}
 }
   //Our own implementation
  class MyOwn implements DefaultInt {
	  
	  public void m1() {
		  System.out.println("My own implementation");
	  }
	  public static void main(String[] args) {
		MyOwn m = new MyOwn();
		m.m1();
	}
  }