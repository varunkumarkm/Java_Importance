package Assignment;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Q {

	static String text= "foo";

	
	public static void main(String[] args) throws InterruptedException {
	LocalTime now = LocalTime.of(10,10,10);
	LocalTime start = LocalTime.of(8, 30).withMinute(now.getMinute());
	LocalTime end = LocalTime.of(12, 30).withMinute(now.getMinute());
	long timePassed = now.until(start, ChronoUnit.HOURS);
	long timeToGo = now.until(end, ChronoUnit.HOURS);
    System.out.println("-------------------question1---------------------");

	System.out.println(timePassed+" "+timeToGo);
    System.out.println("----------------question2------------------------");
	if(!text.equals("FOO")) {
		String text = "bar";
	}else {
		String text = "bar";
	}
      System.out.println(text);
      System.out.println("----------------question3------------------------");
      
  	var list = new ArrayList();
     list.add("a");
     list.add(1);
     for(var element: list) {
    	 System.out.println(element+" ");
     }
     for(var i=0; i<list.size(); i++) {
    	 System.out.println(list.get(i)+ " ");
     }
     System.out.println("----------------question4------------------------");

    
     
     List original = new ArrayList();
     original.add(null);
     List copy = List.copyOf(original);
     System.out.println(copy.get(0));
     System.out.println("-----------------question5-----------------------");

     
     Data data1 = new Data("Hello");
     data1.val=1;
     System.out.println(data1.val.getClass().getSimpleName());
     System.out.println("----------------------------------------");

     
     Set<Data1> set1 = new HashSet();
     set1.add(new Data1(1));
     Set<Data1> set2 = Collections.unmodifiableSet(set1);
     set2.stream().findAny().get().number=2;
     int number= set1.stream().findAny().get().number;
     System.out.println(number);
	}
	
}

class Data<T>{
	T val;
	Data(T val){
		
	}
}

class Data1{
	int number;
	Data1(int number){
		this.number=number;
	}
}



