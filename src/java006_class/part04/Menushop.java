package java006_class.part04;

/*
 * [분식점 프로그램]
 * 1.메뉴명
 * 2.가격
 * 3.주문갯수
 * 4.계산
 * 
 * 객체속성 : 메뉴명, 가격, 주문갯수
 * 객체동작 : 계산하다.
 * 
 * 메뉴명 가격 주문갯수
 * 떡볶이 2000 3
 * 김말이 500 2 
 * 어묵 300 4
 * 
 * 
 */
public class Menushop {
	String menu;// 메뉴명
	int price;// 가격
	int cnt;// 주문갯수

	int count() {
		return price * cnt;
	}

	void display() {
		System.out.println("메뉴명:" + menu);
		System.out.println("메뉴명:" + price);
		System.out.println("메뉴명:" + cnt);
		System.out.println("메뉴명:" + count());
	}
}
