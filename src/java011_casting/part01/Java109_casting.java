package java011_casting.part01;
/*
 
 *  형변환(casting)->기본데이터 타입
 *  int num = 3; 
 *  double data= num;//묵시
 *  short val = (short)num;//명시
 *  
 *  객체형변환-참조데이터타입
 *  1.상속관계일때 형변환이 가능하다(is a)
 *  2.업캐스팅 발생된후 다운캐스팅을 할 수 있다.
 *   -업캐스팅(up-casting):부모객체로 자식객체를 참조할수 있도롣 형변환하는 기술
 *   -다운캐스팅(dowm-casting):업캐스팅을 다시 원상복구해주는 형변환하는 기술
 *   
 *  
 */
public class Java109_casting {
	public static void main(String[] args) {

//		SampleA sa = new SampleA();
//		SampleB sb = new SampleB();
//		sa = (Sample)sb;
		
		Parent p = new Parent();
		Child c = new Child();
		
		//Parent p = new Child();
		p = c; //업캐스팅
		p.process();
		//p.call();
		
		
		//다운 캐스팅
		Child d = (Child) p;
		
		//객체생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();
		//pt.call();
		
		//다운캐스팅
		Child cn = (Child)pt;
		cn.call();
		
	}
}
