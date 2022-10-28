package java999;

import java.util.Scanner;

class Menu {
	FriendInfoController controller;

	Menu() {
		controller = new FriendInfoController();
	}

	public void displayMenu() {
		while (true) {
			System.out.println("=======메뉴선택=====");
			System.out.println("0. 프로그램 종료");
			System.out.println("1. 연락처 저장");
			System.out.println("2. 연락처 출력");
			
			// System.out.println("연락처 삭제");
			System.out.println("원하는 번호를 선택하세요");

			Scanner input = new Scanner(System.in);

			int choice = input.nextInt();

			//System.out.println("초이스" + choice);

			switch (choice) {
			
			case 0:
				System.out.println("프로그램을 종료합니다.");
				
				
				return;
			case 1: // 연락처 저장
				controller.addFriend(choice);
				break;
			case 2: // 연락처 출력
				controller.displayFriendInfo();
				break;
		//	 case 3 : //연락처 삭제
			//	 controller.delete();
			
			default:
				System.out.println("잘못입력했습니다.\n번호를 확인하세요");
				break;

			}
		}

	}
}
