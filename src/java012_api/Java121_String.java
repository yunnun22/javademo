package java012_api;
/*
 * [출력결과]
 * java jsp spring
 */
public class Java121_String {

	public static void main(String[] args) {
		String stn= new String ("java_jsp_spring");
		System.out.println(process(stn.toCharArray()));
	}

	private static char[] process(char arr[] ) {
		//'_'을 ' '으로 변환후 리턴하는 프로그램을 구현하시오.
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]=='_')
				arr[i]=' ';
		}
		return arr;
	}
	
}
