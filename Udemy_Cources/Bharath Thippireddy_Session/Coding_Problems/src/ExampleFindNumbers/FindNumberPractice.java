package ExampleFindNumbers;

import java.util.HashSet;

public class FindNumberPractice {
	
	public static boolean findNumbers(int arr [], int targetNumber) {
		
		HashSet<Integer> processedNumber = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			int requiredNumber = targetNumber - arr[i];
			
			if(processedNumber.contains(requiredNumber)) {
				
				System.out.println(requiredNumber);
				System.out.println(arr[i]);
				
				return true;
			}else {
				processedNumber.add(arr[i]);
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
      System.out.println(FindNumberPractice.findNumbers(new int[] {20, 30, 10, 20, 50}, 150));
	}

}
