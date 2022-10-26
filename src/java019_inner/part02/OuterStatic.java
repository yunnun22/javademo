package java019_inner.part02;

public class OuterStatic {

	private int x;
	static private int y;

	static void call() {
		// x=30
		y = 9;
		System.out.println(y);
	}

	static class InnerStatic {
		int z;

		void prn() {
			// 비 static 외부자원을 static내부틀래스에서 참조할수 앖다.
			// x=50;
			y = 20;
			z = 40;
			System.out.printf("y=%d, z=%d\n",y,z);

		}

	}
}
