package java014_api;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현
 * [출력결과]
 * 2016-2-29 월요일
 */
import java.util.Calendar;

public class Java150_Calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;

		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, month-1);
		System.out.println(cal.toString());
		
		//2월의 마지막일
		int date = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.toString());
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		char week = ' ';
		switch(day) {
		case 1 : week= '일'; break;
		case 2 : week= '월'; break;
		case 3 : week= '화'; break;
		case 4 : week= '수'; break;
		case 5 : week= '목'; break;
		case 6 : week= '금'; break;
		case 7 : week= '토'; break;
		}
		System.out.printf("%d-%d-%d %c요일\n", year, month, date, week);
	}

}
