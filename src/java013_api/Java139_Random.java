package java013_api;

//import static java.lang.Math.floor;
//import static java.lang.Math.random;//왜생김ㅡ3ㅡ

import java.util.Arrays;
import java.util.Random;

public class Java139_Random {
	
public static void main(String[] args) {
	int[] num = new int[5];// 1부터 10까지
	
	Random ran = new Random();
	
	
	for(int i = 0; i <num.length; i++) {
		//난수 발생
		num[i] = ran.nextInt(10)+1;
		
		//중복체크
		for(int j = 0; j < i ; j++) {
			if(num[j]==num[i]) {
				i--;
				break;
			}
		}
		
	}
	Arrays.sort(num);//정렬
	for (int data : num)
		System.out.printf("%4d",data);
}
}
