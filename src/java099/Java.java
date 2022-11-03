package java099;


import java.util.Scanner;

public class Java {

	public static void main(String[] args)  {
System.out.println("메세지를 입력하세요");
System.out.println("프로그램을 종료하려면 q를 눌러");

Scanner scanner = new Scanner(System.in);
String inputString;

do {
	System.out.print(">");
	inputString = scanner.next();
	System.out.println(inputString);
}while(! inputString.equals("q"));

System.out.println();
System.out.println("프로그램종료");

	}
	
	

}

