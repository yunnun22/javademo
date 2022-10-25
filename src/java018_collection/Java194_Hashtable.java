package java018_collection;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Hashtable
 * 1. Map인터페이스 구현해놓은 클래스
 * 2. Map인터페이스를 구현해놓운 쿨래수들은 key, value쌍으로 저장한다.
 * 3. value를 구현해주는것은 key이므로 key는 중복을 허용하지않는다.
 */
public class Java194_Hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");
		
		System.out.println(table.get(10));
		
		System.out.println("========Enumeration========");
		
		Enumeration<String> enu = table.elements();
//value 가져오기
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		Enumeration<Integer> enuKey = table.keys();
		//key가져오기
		Integer key = enuKey.nextElement();
		System.out.printf("%d:%s\n", key,table.get(key));
		
		
		
	}
}
