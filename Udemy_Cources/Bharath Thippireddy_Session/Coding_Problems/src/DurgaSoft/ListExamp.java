package DurgaSoft;

import java.util.Set;
import java.util.TreeSet;

public class ListExamp {

	public static void main(String[] args) {
		Set<Integer> t = new TreeSet<>();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(25);
		t.add(20);
		t.add(5);
		System.out.println("Before sorting default:"+ t);
		//This is default sorting order [0, 5, 10, 15, 20, 25]
		//We need to customized sorting, then we pass a comporator object
		Set<Integer> c = new TreeSet<>((i1, i2) -> (i1 > i2)? -1 : (i1 < i2)? 1 : 0);
		c.add(10);
		c.add(0);
		c.add(15);
		c.add(25);
		c.add(20);
		c.add(5);
		System.out.println("After sorting customized:"+ c);
	   }//[25, 20, 15, 10, 5, 0]
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    