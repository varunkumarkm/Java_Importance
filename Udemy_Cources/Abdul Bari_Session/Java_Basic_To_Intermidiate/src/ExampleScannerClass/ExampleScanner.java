package ExampleScannerClass;

import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter the value and sum this values");
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = a+b;
		
		System.out.println("The sum value is:" + c);
	}
}

 class DemoScanner {
	 public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 String name;
		 System.out.println("May I know your name");
		 
		 name = scan.nextLine();
		 
		 System.out.println("Welcome mr/mis: "+ name);
	}
 }
 
 class ScannerDemo {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float floatValue;
		double doubleValue;
		long sum;
		
		System.out.println("Enter the float and double value");
		
		floatValue = scan.nextFloat();
		doubleValue = scan.nextDouble();
		sum = (long) (floatValue + doubleValue);
		
		System.out.println("The sum value is: "+sum);
	}
 }
 
 class ScanDemo {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the integer value");
		
		int intVal = scan.nextInt();
		float floatVal = scan.nextFloat();
		
		System.out.println("you enter the value is:" + intVal + floatVal);
	}
 }
 
 class StringScanner {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name;
		
//		name = scan.next();//I have enter varun kumar k m	
//		System.out.println("Your name is: "+ name);// varun (it takes only one value
		
		name = scan.nextLine();//I have enter varun kumar k m	
		System.out.println("Your name is: "+ name);//varun kumar k m
	}
 }
 
 class RadixMethod {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Binary number");
		
		int binayNum;
		
		scan.useRadix(2);
		
		binayNum = scan.nextInt();
		System.out.println("The value is: "+binayNum);
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 