package DurgaSoft;

 interface Intraf {

	 public void m1();
}
  class Teste {
	  int x = 10;
	  
	  public void m2() {
		  int y = 20;
		  
		  Intraf i = () -> {
			  x = 888;
		   // y = 999;  Local variable y defined in an enclosing 
			  //scope must be final or effectively final
			  System.out.println(x);//10
			  System.out.println(y);//20
		  };
		  i.m1();
	  }
	  public static void main(String[] args) {
		Teste t = new Teste();
		t.m2();
	}
  }
