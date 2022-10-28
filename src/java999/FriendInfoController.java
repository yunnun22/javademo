package java999;

import java.util.Scanner;

public class FriendInfoController {

	private Friend[] friend;
	private int indexOfFrd;
	final private int MAX_FRD;
	private String name;
	private String phoneNumber;
	private String age;

	public FriendInfoController() {
		MAX_FRD = 3;
		indexOfFrd = 0;
		friend = new Friend[MAX_FRD];
	}

	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);

		System.out.print("이름을 입력하세요 :");
		name = input.nextLine();
		System.out.print("전화번호를 입력하세요 :");
		phoneNumber = input.nextLine();
		System.out.print("나이를 입력하세요 :");// if없앰
		age = input.nextLine();

		friend[indexOfFrd] = new Friend(name, phoneNumber, age);

		indexOfFrd++;

		
	}

	public void displayFriendInfo() { // 2기능?
		for (int i = 0; i < indexOfFrd; i++) {
			// for (int i = indexOfFrd; indexOfFrd < MAX_FRD; indexOfFrd++) {

			friend[i].displayFriendInfo();
		System.out.println("-----------------------");
		
	
		}

		// System.out.printf(" 이름:%s\n 번호:%s\n 나이:%s\n", this.name, this.phoneNumber,
		// this.age);
	}

	//public void delete() {
		
		
	//}

}
