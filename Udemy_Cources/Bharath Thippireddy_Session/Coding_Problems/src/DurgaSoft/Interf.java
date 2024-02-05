package DurgaSoft;

//Without lambda expression
 interface Interf {

	 public void m1();
}
 class Tested {
	 int x = 888;
	 public void m2(){
		 Interf i = new Interf() {
			 int x = 999;
			 
			 public void m1() {
				 System.out.println(this.x);
			 }
		 };
		 i.m1();
	 }
	 public static void main(String[] args) {
		Tested t = new Tested();
		t.m2();
	}
 }

 //With lambda expression
   interface inter {
	   public void m1();
   }
   class Tests {
	   int x = 888;
	   public void m2() {
		   
	   }
   }
 