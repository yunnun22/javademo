package java013_api;

import java.util.Random;

public class Java138_Random {
	
	public static void main(String[] args) {
         Random ran = new Random();
         double r1 = ran.nextDouble();
         System.out.println(r1);
         
         int r2 = ran.nextInt();//10진수난수
         System.out.println(r2);

         int r3 = ran.nextInt(10);//0부터 10미만 
         System.out.println(r3);
         
         //1부터 ~ 10까지
         System.out.println(r3 + 1);
	}
}
