package java013_api;

import static java.lang.Math.*;
/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오
 * ex) 0.565664....    ->5.7
 */
public class Java136_Math {
	public static void main(String[] args) {

//==============나=======================
//		double ran = random();
//		ran = ran * 10;
//		System.out.println(ran);
//		System.out.println(Math.round(ran*10)/10.0);
	
//==============쌤======================
		double nan = random();
		System.out.println(nan);
		
		nan = nan * 100;
		System.out.println(nan);
		
		//System.out.println(round(nan));

		long data = round(nan);
		System.out.println(data);
		
		double num =data/10.0;
		//double num =(double)data/10;
		System.out.println(num);
		
		System.out.println("==============================");
		double res = random();
		System.out.println(res);
		System.out.println((double)round(res*100)/10);
		
		
	}
}
