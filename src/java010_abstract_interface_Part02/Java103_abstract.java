package java010_abstract_interface_Part02;

public class Java103_abstract {
	public static void main(String[] args) {
		Rect rect = new Rect(10, 20);
		System.out.println("사각형넓이:" + rect.getArea());
		
		Tri tri = new Tri(10, 20);
		System.out.println("삼각형넓이:" + tri.getArea());
	}
	
}
