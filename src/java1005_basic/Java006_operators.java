package java1005_basic;

/*
 * 연산자 (operation) : 어떠한 기능을 수행하는 기호(+,-,*,%등등)
 * 피연산자 (operand) : 연산자의 작업 대상 (변수, 상수, 리터널, 수식 등....)
 * 
 * 연산자의 종류
 * 1.산술연산자(이항연산자): +,-,*,/,%
 * 2.비교연산자(이항연산자): >,<>=,<=,==,!=
 * 3.논리연산자(이항) :(%% (and), \\(or), !(not)
 * 4.조건연산자(삼항): 조건식 ? 참 : 거짓
 *5.대입연산자(이항) : = , +=
 *6.증감연산자(단항) :==(1씩증가) --1씩감소
  */

public class Java006_operators {

	public static void main(String[] args) {
		
		int numX = 10;
		int numY = 5;
		
		int res = numX+numY;
		System.out.println(res);
		
		double avg = 4.5;
		
double val = numX + avg;
System.out.println(val);


short a =3;
short b =4;

//int 이하끼리 연산하면 int이하끼리 연산하면 int으로 리턴한다ㅣ
//type mismatch : comment concer convers for to short
//short c = a + b;
int c = a + b;
		System.out.println(c);
		
		/*
	       * int = short + short 
	       * int = byte + byte 
	       * int = char + char 
	       * int = short + byte
	       * int = byte + char 
	       * int = int + byte
	       */
		
		   // 자바에서 문자를 표현할 때 유니코드를 사용한다.
	      char data = '0'; // 48
	      char alpa = 'A'; // 65
	      int sum = data + alpa;
	      System.out.println(sum);
		
	
		
	}

}
