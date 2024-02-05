package Example_Genrics;

public class CreateGenericClass<T> {

	T obj;

	public CreateGenericClass(T obj) {
		this.obj = obj;
	}
	
	public void displayObjectDetails() {
		System.out.println("The type of object: "+ obj.getClass().getName());
	}

	public T getObj() {
		return obj;
	}
	
}
