package java005_method;
/*
 * 자바에서 제공하는 데이터 타입(data type)
 * 1.primirive data type : byte short int long float double bpplean char
 * 2.reference data type : array, class, interface, enum
 * 
 * [argument 전달방식]
 * 1. call by value :값에 의한 복사
 * argument 를 전달할때 primitive data type을 넘겨주는 형식
 * 장정:복사하여 처리하기 때문에 원래값이 보전되어 안전하다.
 * 단점: 복사를 하기때문에 메모리 사용량이 늘어난다.
 * 
 * 2.call by reference :주소에 의한 복사
 * 알규먼트를 전달할때 레퍼런스 데이터 타입을 넘겨주는 형식
 * 장점 참조를 하기때문에 메모리를 절약한ㄷ.
 * 단점 참조를 하기떄문ㅇ[ 웒래값에 영해ㅑㅇ을 박ㄷ는다
 */
public class Java057_method {

	public static void main(String[] args) {
		int a =10, b = 20;
		
		System.out.printf("a=%d, b=%d\n",a,b);
		callByValue(a,b);
		System.out.printf("a=%d, b=%d\n",a,b);
		
		int [] num = new int [] {10,20};
		  System.out.printf("num[0]=d%, num[1]=d\n", num[0], num[1]);
		  callByReference(num);
		  System.out.printf("num[0]=d%, num[1]=d\n", num[0], num[1]);
		  
	}//end main()
	

	public static void callByValue(int c, int d) {
		int temp = c;
		c = d;
		d= temp;
		System.out.printf("a=%d, b=%d\n", c, d);
		
	}//end callByValue------------------------------------------여기부터 못따라한듯?결과 다름
	public static void callByReference(int arr[]) {
		  int imsi = arr[0];
	      arr[0] = arr[1];
	      arr[1] = imsi;
	      System.out.printf("arr[0]=d%, arr[1]=d\n", arr[0], arr[1]);
	}
	
	
	
}
