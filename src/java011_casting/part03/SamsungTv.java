package java011_casting.part03;

public class SamsungTv {
 String maker;
 public SamsungTv() {
	
}
  public SamsungTv(String maker) {
	this.maker = maker;
}
  public void turnOn() {
		 System.out.printf("%s Tv-전원을 켠다.\n", maker);
		
	}
	 public void turnOff() {
		 System.out.printf("%s Tv-전원을 끈다.\n", maker);
		
	}
	 public void soundUp() {
		 System.out.printf("%s Tv-소리를 높인다.\n", maker);
		
	}
	 public void soundDown() {
		 System.out.printf("%s Tv-소리를 줄인다.\n", maker);
		
	}
	 public void move() {
		 System.out.println("Samsung move");
	 }
}
