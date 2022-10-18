package java012_api;
/*
 * 정상적으로 주민번호가 입력됐으면 true를 반환하고 아니면
 *false를 반환하는 프로그램을 구현하세요
 *
 *[출력결과]
 *851306-2589540 승인이 되었습니다.
 *750625-16843 다시 입력하세요.
 */
public class Java127_RegEx {
 public static void main(String[] args) {
	System.out.print("851306-2689540");
	display(process("851306-2689540"));
	
	System.out.print("750625-16843");
	display(process("750625-16843"));
}



private static boolean process(String sn) {
	//여기를 구현하세요
	
	return sn.matches("\\d{6}-\\d{7}");
}
private static void display(boolean res) {
	if(res) {
		System.out.println("승인이 완료되었습니다.");
	}else {
		System.out.println("다시 입력하세요");
	}
	
}
 
 
}
