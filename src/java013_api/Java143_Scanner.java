package java013_api;

import java.util.Scanner;
/*
 * 단입력: 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * . . . 
 * 5 X 9 = 45
 * 계속하시겠습니까?(종료: n 계속:아무키)
 * 프로그램 종료
 */

public class Java143_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//=================내꺼========================
//		 int j = 1;
//		 for(int i = 1; i<10;j++) {
//			 i = i*j;
//			 System.out.println(i);
//==================쌤==========================
		while (true) {
			System.out.print("단 입력:");
			int dan = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
			}
			System.out.print("계속하시겠습까?(종료:n, 계속:아무키): ");
			String chk = sc.next();
			 if(chk.equals("n")){
			//if (chk=="n") {//왜 종료가 안나오냐;;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
