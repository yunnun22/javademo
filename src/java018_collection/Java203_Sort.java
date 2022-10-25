package java018_collection;

import java.util.ArrayList;

public class Java203_Sort {
	 
	public static void main(String[] args) {
		ArrayList<Person> ts = new ArrayList<Person>();
		ts.add(new Person("홍길동",40));
		ts.add(new Person("가비",20));
		ts.add(new Person("가비",30));
		ts.add(new Person("나비",15));
		
		prnDisPlay(ts);
		sortDisplay(ts);
		
	}
	public static void prnDisPlay(ArrayList<Person> aList) {
		for(Person ps:aList)
			System.out.printf("%s %d\n",ps.getName(), ps.getAge());
		
	}
	public static void sortDisplay(ArrayList<Person> aList) {
		System.out.println("====Sort========");
		aList.sort(new Person());
		prnDisPlay(aList);
		
		
	}

}
