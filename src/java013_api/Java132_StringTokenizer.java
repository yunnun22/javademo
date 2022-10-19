package java013_api;

import java.util.StringTokenizer;
//ctrl + shift + O

public class Java132_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer("문자열", "구분자")
		// 문자열의 구분자가 공백일떄는 2번쨰 인자갑은 생략 할 수 있다.
		// StringTokenizer st = new String("java,jap",",");

		StringTokenizer st = new StringTokenizer("java jsp");
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());

//		int count = st.countTokens();
//		for(int i = 0 ; i< count; i++) {
//			System.out.println(st.nextToken());
//		}

		// 메모리 저장된 토큰이 있으면 true, 없으면 false를 리턴한다.
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		

	}
}
