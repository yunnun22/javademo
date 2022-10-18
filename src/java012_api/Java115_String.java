package java012_api;

public class Java115_String {
	public static void main(String[] args) {
		char[] data = { 'j', 'a', 'V', 'A' };

		StringTest st = new StringTest(data);
		System.out.println(st.lenght());
		System.out.println(st.isUpperCase(2));
		System.out.println(st.isUpperCase(0));
		System.out.println(st.isLowerCase(0));
		System.out.println(st.isLowerCase(2));
		System.out.println(st.charAt(0));
		System.out.println(st.toSting());
		System.out.println(st);// 답이 jaVA가 나와야허는디;;;;;;

	}
}
