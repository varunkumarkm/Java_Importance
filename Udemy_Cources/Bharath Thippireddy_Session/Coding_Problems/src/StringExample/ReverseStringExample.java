package StringExample;


public class ReverseStringExample {
	
	
	public static String reverse(String input) {
		String result = "";
		
		for (int i = input.length()-1; i>=0; i--) {
//			result = result + input.charAt(i);
			result += input.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
//         StringBuffer reverse = new StringBuffer("varun").reverse();
//         System.out.println(reverse);
		
		System.out.println(ReverseStringExample.reverse("varunkumar"));
		}
	}
