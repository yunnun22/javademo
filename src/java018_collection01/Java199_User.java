package java018_collection01;

/*
 * 1 와일드 카드(?)를 제공하는 이유
 *   :컬렉션에 저장되는 요소들이 특정한 객체로 정해진 상태에서 다른 객체형은
 *    저장할 수 없는 상태였다. 하지만 때로는 기존과 같이 모든 객체들을
 *    저장해야 할때가 있다.
 *    Vector v=new Vector();
 *    v.add(new Integer(20));
 *    v.add(new String("java"));
 * 
 * 2 와일드 카드의 구성
 *   <?> : 모든 객체자료형에 대한 배치를 의미한다.
 *   <? super 객체자료형> :  명시된 객체자료형이나 객체자료형의 상위
 *              객체들의 배치를 의미한다.
 *   <? extends 객체자료형> : 명시된 객체자료형이나 객체자료형으로 부터
 *              상속받은 하위객체들의 배치를 의미한다.
 */



class Seoul{
	public void showYou() {
		System.out.println("seoul");
	}
}

class Fruit extends Seoul{
	@Override
	public void showYou() {
	System.out.println("Fruit");
	}
}

class Apple extends Fruit{
	@Override
	public void showYou() {
	  System.out.println("Apple");
	}
}

class Orange extends Fruit{
	@Override
	public void showYou() {
	System.out.println("Orange");
	}
}


class FruitBox<T>{
	private T item;
	
	public FruitBox() {
	
	}
	
	public void store(T item) {
		this.item = item;
	}
	
	public T pullout() {
		return item;
	}
}

public class Java199_User {
	public static void main(String[] args) {
		FruitBox<Orange> fOrange = new FruitBox<Orange>();
		fOrange.store(new Orange());
		openAndAllBox(fOrange);
        openAndExtendsBox(fOrange);
        //openAndSuperbox(fOrange);
        
        FruitBox<Seoul> fSeoul = new FruitBox<Seoul>();
        fSeoul.store(new Seoul());
        openAndAllBox(fSeoul);
      //  openAndExtendsBox(fSeoul);
        openAndsuperbox(fSeoul);
	}//end main()
	
	public static void openAndAllBox(FruitBox<?> param) {
		System.out.println(param.pullout());
		((Seoul)param.pullout()).showYou();
		
	}//end openAndAllBox()
	
	public static void openAndExtendsBox(FruitBox<? extends Fruit> param) {
		param.pullout().showYou();
	}//end openAndExtendsBox()
	
	public static void openAndsuperbox(FruitBox<? super Fruit> param) {
		((Seoul)param.pullout()).showYou();
	}
	
}//end class






