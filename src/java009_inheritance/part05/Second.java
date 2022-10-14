package java009_inheritance.part05;

//import java.lang.Override;
//import java.lang.System;
import java.lang.String;

public class Second extends First {
	int b = 20;

	@Override
	void display() {
		System.out.println("b=" + b);
	}

//	@Override
//	public String toString() {
//		
//		return String.format("b=%d",b);
//	}

	void superThisMethod() {
		super.display();
		this.display();
	}

}
