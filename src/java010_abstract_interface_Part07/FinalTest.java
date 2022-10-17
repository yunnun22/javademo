package java010_abstract_interface_Part07;

public class FinalTest {
	final int CODE = 1;// final이 선언 변수는 초기값을 할당해야한다. 대문자 권장인터페이스에서는 소문자가능

	public FinalTest() {

	}

	void display() {
       System.out.println("display");
	}
	final void process() {
		System.out.println("process");
	}
}
