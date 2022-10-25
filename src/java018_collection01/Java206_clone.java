package java018_collection01;

import java.util.ArrayList;
import java.util.Arrays;

public class Java206_clone {
	public static void main(String[] args) {
		Integer[] it = new Integer[] { 3, 5, 2, 4, 7 };

		ArrayList<Integer> sourceList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println("sourceList:" + sourceList.toString());
		
		ArrayList<Integer> destList = (ArrayList<Integer>)sourceList.clone();
		System.out.println("destList:" + destList.toString());
		
		
		sourceList.sort(new Ascending());
		System.out.println("sourceList:" + sourceList.toString());
		System.out.println("destList:" + destList.toString());
		
		
	}//end main()

}//end class
