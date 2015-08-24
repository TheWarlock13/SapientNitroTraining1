package demoarray;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class sapient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		int[] num={5,10,2,5,4};
		
		 int[] num1={1,2,5,4,3};
		 
		 
		
		
		System.arraycopy(num, 0, num1, 0, 5);
		for(int counter: num1)
			System.out.println(counter);
	}

}
