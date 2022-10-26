package java019_inner.part03;

public class OuterLocal {

	private int x;
	private int y;
	final private int z = 10;

	public void call(int a) {
		final int b = 20;
		int c = 30;
		//a = 300;// 매개변수
		//c = 500;// 지역변수
		System.out.printf("a=%d\n", a);

		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;
				//z = 20; 
				
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println("c=" + c);
			}// prn
		}// InnerLocal
		InnerLocal inner = new InnerLocal();
		inner.prn();

	}// call
}// class
//final은 새로운값 할당못?
