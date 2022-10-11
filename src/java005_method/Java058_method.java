package java005_method;

public class Java058_method {

	public static void main(String[] args) {
		//조건 : data변수에는 소문자만입력
		char data = 'd';
		char code = process(data);
		System.out.printf("%c의 대문자는 %c입니다.\n", data, code);
	}//end main()
	
   //data매개변수의값을 대문자로 변경해서 리턴
	public static char process(char data) {
		//1. 대문자A (65), 소문자 a(97)의 유니코드
		//2. 대문자와 소문자차이
		//3. int이하의 데이터 타입끼리 연산이 되면 결과는 int으로 리턴
		
		return (char)(data-32);
	}
	
}//end class
