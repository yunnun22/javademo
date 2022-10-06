package java003_statements;
/*
 * 1~10까지 짝수, 홀수 누적으 ㄹ계산하는 프로그햄
 * 
 * [출력결과]
 * 홀수누적 : 25
 * 짝수누적 : 30
 */

public class Java029_for {

	public static void main(String[] args) {
		int odd = 0;//홀수
        int even = 0;//짝
		for (int i = 1; i <= 10; i++){   //i변수의 값이 홀수이면
			//i변수의 값이짝수이면            //if(i%2==1){
		if(i % 2 == 0) {                  //odd = odd + i;
			even = even + i;              //}else {
		}else {                           //even = even + i; 
			odd = odd + i;                 //}
		}
		}
		System.out.printf("홀수누적 : %d\n", odd);
		System.out.printf("짝수누적 : %d\n", even);
	}

	

}
