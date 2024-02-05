package PalindromeExample;

public class PalindromPractice {

    public static boolean isPalindrome(String input) {
    	
    	if(input == null) {
    		throw new IllegalArgumentException("String cannot be an empty");
    		
    	}
		StringBuilder builder = new StringBuilder(input);
		StringBuilder reverse = builder.reverse();
		
		return reverse.toString().equalsIgnoreCase(input);
    }
	
	public static void main(String[] args) {
		
		System.out.println(PalindromPractice.isPalindrome("malaYalam"));
	}
}
