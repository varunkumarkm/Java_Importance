package DurgaSoft;

//Without lambda expression

interface Infra {

	public int getSquare(int i);
 }

class Demo implements Infra {
	
	public int getSquare(int i) {
		return i*i;
	}
}

 class Test {
	 public static void main(String[] args) {
		Infra i = new Demo();
		System.out.println(i.getSquare(4));
		System.out.println(i.getSquare(10));
	}
 }