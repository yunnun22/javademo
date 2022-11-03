package java022_debug;
/*
 * bug : 어떤의도하지 않은 문제가 발생한 오류
 * debug : bug를 찾아 수정하는 작업
 * debugging : bug를 원하는대로 실행이 되도록 작업하는 과정
 * debugger : debugging을 할때 사용하는 도구
 * 
 * 디버깅 종류
 * 1 출력문릏 이용한 디버깅
 * 2 디버깅 틀을 이용한 디버깅
 */
public class DebugTest01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i <5; i++) {

			System.out.printf("i=%d\n",i);
			sum = sum + count(i);
		}
		System.out.printf("sum=%d\n", sum);
	}
	public static int count(int index) {
		int[] num = new int[] {1, 5, 2, 3, 4};
		return num[index];
		
	}
}
