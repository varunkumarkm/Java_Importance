package Java_13_and_14_features.RecordFeatureExample;

public record Employee(String name, int salary) {

	static int id;	
	
	public void myMethod() {
		System.out.println(id);
	}
	public void myInstanceMethod() {
		System.out.println(this.name());
		System.out.println(this.salary());
	}
	
	public Employee (String name, int salary) {
		this.name = "varun";
		this.salary = 200;
	}
//	public Employee(String empData) {
//		this.salary = 100;
//		this.name = "arun";
//	}
}
