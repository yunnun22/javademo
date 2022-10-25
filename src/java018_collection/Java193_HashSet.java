package java018_collection;//결과가 안나옴 왜일까 일단 덮어놓자ㅜ

import java.util.HashSet;

public class Java193_HashSet {

	// HashSet : 중복허용안되고, 순서유지안된다.
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		
		for(Integer it : set)
			System.out.println(it);
		
	}
}
