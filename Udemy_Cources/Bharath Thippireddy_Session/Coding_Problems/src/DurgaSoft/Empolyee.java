package DurgaSoft;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
		
		int eno;
		String eName;
		
		public Employee(int eno, String eName) {
			super();
			this.eno = eno;
			this.eName = eName;
		}
		@Override
		public String toString() {
			return "Employee [eno=" + eno + ", eName=" + eName + "]";
		}
	}
 class Employees {
	 public static void main(String[] args) {
		 
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new Employee(100, "ramesh"));
		arr.add(new Employee(400, "nagesh"));
		arr.add(new Employee(350, "satish"));
		arr.add(new Employee(200, "manu"));
		System.out.println("Before Sorting: "+arr);
		Collections.sort(arr, (emp1, emp2) -> (emp1.eno < emp2.eno)? -1: (emp1.eno > emp2.eno)? +1: 0);
		System.out.println("After Sorting: "+arr);
	}
 }


 
 
 
 
 
 
 
 
 
 
 
 
 
 
