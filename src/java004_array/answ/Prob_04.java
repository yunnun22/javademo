package java004_array.answ;


/*
 * 배열에 저장된 요소의 갯수만큼 문자를 출력하는 프로그램을 구현하시오.
 * 출력결과
 * @@@
 * @@
 * @@@@@
 * @@@@@@
 * @
 */

public class Prob_04 {

	public static void main(String[] args) {
		int num[]=new int[]{3,2,5,6,1};
		
		//여기를 구현하시오
		
		for(int i=0;i<num.length;i++){
			for(int j=1;j<=num[i];j++){
				System.out.print('@');
			}
			System.out.println();
		}
	}//end main()

}//end class
