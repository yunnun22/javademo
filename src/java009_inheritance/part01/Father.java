package java009_inheritance.part01;

public class Father /*extends Object*/ {
   int a = 3;
  // private int = 10; //상속못함
   public Father() {
	System.out.println("Father");
}
   
   void display() {
	   System.out.println("a="+a);
   }
}
