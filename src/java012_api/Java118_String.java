package java012_api;

/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8080
 */
public class Java118_String {
	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		

		//내가 한거^^System.out.printf("ip:%s",sn);
		
		int index = sn.indexOf(":");
		System.out.println("ip:"+sn.substring(0,index));
		System.out.println("port:"+sn.substring(index+1));
	}
}
