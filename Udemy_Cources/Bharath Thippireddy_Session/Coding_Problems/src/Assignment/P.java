package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P {

	public static void main(String[] args) throws InterruptedException {
		 Main1 obj = new Main1();
	     List<String> data = new ArrayList<>(Collections.nCopies(500, "Method"));
	     obj.generate(data);
	}
}

class Main1{
	public void generate(List<String> data) throws InterruptedException{
		if(data.size()>50) {
			throw new InterruptedException("error");
		}
	}
	}
	
