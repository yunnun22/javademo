package java012_api;
/*
 * 정규화 표현식(Regular Expression)
 * 1.정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해
 * 사용하는것으로 미리 저으이 된 기호와 문자를 이용해서 작성한 문자열을 말한다.
 */
public class Java124_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
				String sg = "";
				
			//a 또는 r이면 '_'로 변경
				
				for (int i=0;i<sn.length();i++) {
					char data = sn.charAt(i);
					if(data == 'a' || data == 'r') {
						sg +="_";
					}else {
						sg += data;
					}
				}
				System.out.println(sg);
				System.out.println("Regular Expression을 이용한 문자 변경");
				//[]대괄호는 or을 의미한다.
				//sn변수에 저장된 문자열에서 a이거나 r이면 "_"으로 변경한다.
				System.out.println(sn.replaceAll("[ar]", "_"));
				
				//sn변수에 저장된 문자열애서 a이거나 r이 포함되어있으면 true 아니면 false를 리턴
				//atest, rtest, testra, restr, terst
				System.out.println(sn.matches(".*[ar].*"));
				
				//sn변수에 저장된 문자열에서 a이거나 r로 시작하면 true 아니면 false를 리턴
				System.out.println(sn.matches("[ar].*"));
				
				//sn변수에 저장된 문자열에서 a이거나 r로 끝나면 true 아니면 false를 리턴
				System.out.println(sn.matches(".*[ar]"));
				
				//{2,3} : 2부터 3개까지의 공백을 "@"으로 변경한다.
				String st = "java    korea";
				String sa = st.replaceAll("\\s{2,3}", "@");
				System.out.println(sa);
				System.out.println(sa.length());
	}
}
