package java002_statements;
/*
 * [문제]
 * data 변수에 저장된 값이 대문자이면 "대문자입니다." 소문자이면 "소문자입니다."
 * 그외는 "기타입니다."로 출력하는ㅌ 프로그램을 구현하시오
 * 
 * 
 * [출력결과]
 * data='D' -> D는 대문자입니다.
 * data='d' -> d는 소문자입니다.
 * data='1' -> 1는 디타입니다.
 */

public class Java020_if {
	public static void main(String[] args) {
		char data = 'a';

		// 'A'<=data<='z'
		// data<='A' && data<='z' :대문자
		// data<='a' && data<='z' :소문자

		if (data >= 'A' && data <= 'Z') {
			System.out.printf("%c는대문자입니다.\n", data);
		} else if (data >= 'a' && data <= 'z') {
			System.out.printf("%c는소문자입니다.\n", data);
		} else {
			System.out.printf("%c는기타입니다.\n", data);
		}
	}// end main
}// end class
