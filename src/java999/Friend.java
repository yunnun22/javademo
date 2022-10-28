package java999;

public class Friend {
	
	private String name;
	private String phoneNumber;
	private String age;
	
	
	

	public Friend(String name, String phoneNumber, String age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	public void displayFriendInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("폰번호 :" + this.phoneNumber);
		System.out.println("나이 :" + this.age);

		
	}

}
