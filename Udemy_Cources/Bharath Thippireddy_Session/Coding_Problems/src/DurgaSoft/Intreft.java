package DurgaSoft;

 interface Intreft {

	 public void m1();
}
 class Testt {
	 int x = 888;
	 
	 public void m2() {
		 Intreft i = new Intreft() {
			 int x = 999;
			 
			 public void m1() {
				 System.out.println(this.x);
			 }
		 };
		 
		 i.m1();
	 }
	 public static void main(String[] args) {
		Testt t = new Testt();
		t.m2();
	}
 }// 999
 
 interface Interp {
	 public void m1();
 }
  
 class Teast {
	 int x = 888;
	 
	 public void m2() {
		 Interp i = () -> {
			 int x = 999;//This is a local variable
			 System.out.println(this.x);
		 };
		 i.m1();
	 }
	 public static void main(String[] args) {
		 Teast t = new Teast();
		 t.m2();
	}
 }//888

 
 
 
 
 
 
 
 
 
 
 
 
 
 