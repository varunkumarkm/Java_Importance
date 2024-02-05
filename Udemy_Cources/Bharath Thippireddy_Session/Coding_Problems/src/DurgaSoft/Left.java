package DurgaSoft;

 interface Left {

	 default void m1(){
		 System.out.println("left method");
	 }
  }
  interface Right {
	  
	  default void m1(){
		  System.out.println("right method");
	  }
  }
  class Direction implements Left,Right {
//Which method we want to implement we take that method along 
	  //with that interface name
	@Override
	public void m1() {
		System.out.println("My own implementation");
		Left.super.m1();
	}
//	@Override
//	public void m1() {
//		System.out.println("My own implementation");
//		Right.super.m1();
//	}
	public static void main(String[] args) {
		Direction d = new Direction();
		d.m1();
	}
  }