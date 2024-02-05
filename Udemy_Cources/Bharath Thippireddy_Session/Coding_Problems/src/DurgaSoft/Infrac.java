package DurgaSoft;

 interface Infrac {

	 public static void m1() {
		 System.out.println("interface static methods");
	 }
}
 //interface static methods always cll by using interface name only
 class State implements Infrac {
	 public static void main(String[] args) {
//		State s = new State();
//		s.m1();
//		State.m1();//by using class name also we can call
		Infrac.m1();// 
	}
 }
 //---------------------------------
 //It is valid, but not overriding.
 interface Intra {
	 public static void m1() {
		 
	 }
 }
 class statee implements Intra {
     public static void m1() {
		 
	 }
 }
 
 //The parent class is static and child class
 //will be non-static then immediately compiler
 //will not conclude static method
  
 interface Interect {
	 public static void m1() {
		 System.out.println("Static method");
	 }
 }
 class Intrept implements Interect {
	 public void m1() {
		System.out.println("Non static method"); 
	 }
	 public static void main(String[] args) {
		 Intrept i = new Intrept();
		 i.m1();
	}
 }
 
 //in the parent class is static method and 
 //access specifier is public in the child 
 //implemenatation class declaring the same method with
 //private access specifier, in this case it is valid
 //Because it is not overriding
 
 interface Inrta {
	 public static void m1() {
		 
	 }
 }
 class Funtra implements Intra {
	 private static void m1() {
		 System.out.println("Private static method");
	 }
	 public static void main(String[] args) {
		 Funtra f = new Funtra();
		 f.m1();
	}
 }
 
 interface iitra {
	 public static void main(String[] args) {
		System.out.println("Main method in interface");
	}//its working
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 