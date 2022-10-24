package java018_collection;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 1 배열구조로 데이터 관리: Vector ArrayList
 *                      ArrayList-추가-(순차적으로 사용할 떄 사용)
 * 2 노드로 데이터 관리: LinkedList
 *                    삽입, 삭제-(비순차적으로 사용할 떄 사용)
 * 3 List를 구현해놓은 컬랙션
 * Vector, ArrayList, LinkedList 는 add()해준 순서대로 데이터 관리를 해준다
 */
public class Java188_LinkedList {
	 
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		//append 
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		
		//insert
		aList.add(1, new String("mysql"));
		

		
		//remove
		aList.remove(2);
		
		for(int i = 0; i<aList.size(); i++)
			System.out.printf("aList[%d]=%s\n", i, aList.get(i));
		
		System.out.println("============LinkedList========");
		LinkedList<String> aNode = new LinkedList<String>();
		//append
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		//insert
		aNode.add(1, new String("mysql"));
		

		
		//remove
		//무조건 첫번째요소를 삭제
		aNode.remove();
		//마지막요소를 삭제
		aNode.removeLast();
		//특정 index의 요소를 삭제
		aNode.remove(1);
		
		
		
		for(int i = 0; i<aNode.size(); i++)
			System.out.printf("aNode[%d]=%s\n", i, aNode.get(i));
			
		
	}

}
