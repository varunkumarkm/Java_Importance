package AbstractClass;

//Abstract class Example:
public abstract class BMW {

	void commonFunction() {
		System.out.println("Inside common function method");
	}
	abstract void accelerate();
	
	abstract void brake();
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}
}
