package java090;
import java.util.Scanner;
public class Javasooooo {

	    public static void main(String[] args) {
	    
	    // 필요 변수 선언
	    Scanner sc = new Scanner(System.in);
	    int su;
	    String[] name;
	    String[] tel;
	    
	    // 입력 처리할 학생 수가 1~10 수가 아닐 경우 다시 입력받기
	    do{
	        System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
	        su = sc.nextInt();
	    }while(!(su>=1 && su<=10));
	 
	    // 입력받은 수 만큼 배열 선언
	    name = new String[su];
	    tel = new String[su];
	    
	    // 배열 채우기
	    for(int i=0;i<su;i++) {
	        System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
	        name[i] = sc.next();
	        tel[i] = sc.next();
	    }
	    
	    // 출력하기
	    System.out.println();
	    System.out.println("---------------------------------");
	    System.out.printf("전체 학생 수 : %d명\n", su);
	    System.out.println("---------------------------------");
	    System.out.println("이름\t전화번호");
	    for(int i=0;i<su;i++){
	        System.out.println(name[i]+" "+tel[i]);
	    }
	    System.out.println("---------------------------------");
	 
	    }
	 
	}


