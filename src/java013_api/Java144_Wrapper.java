package java013_api;
/*
 * 1.기본자료형을 클래스로 정의해놓은 것을 Wrapper라 한다.
 * char     -> Character
 * byte     -> Byte
 * short    -> Short
 * int      -> Integer
 * long     -> Long
 * float    -> Float
 * double   -> Double
 * boolean  -> Boolean
 * 
 * 2.메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기위해서
 * Wrapper클래스를 제공한다.
 * 
 * 3.auto boxing과 auto nuboxing은 jdk5.0에서 추가된 기능이다.
 * auto boxing -> 스택 -> 힙영역에 복사
 * auto nuboxing -> 힙 -> 스택영역에 복사
 */
public class Java144_Wrapper {
 
	public static void main(String[] args) {
		String data = "123";
		
		//Integer <- String
		Integer it = new Integer(data);
		
		//int <- Integer
		int num = it.intValue();
		
		System.out.println(num);
		
		//Integer <- String
		Integer ig = Integer.valueOf(data);
		//int <-Integer
		int num2 = ig;//auto unboxing
		
		//double <- Integer
		double pro = it.doubleValue();
		System.out.println(pro);
		
		double pro2 = it;//auto unboxing
		
		//long <- Integer
		long nn = it.longValue();
		System.out.println(nn);
		long nn2 = it;////auto unboxing
		System.out.println(nn2);
		
		Double db = new Double(data);
		Double de = Double.valueOf(data);
		int x = de.intValue();
		System.out.println(x);
		//크기 차이로 auto unboxing이 안됨
		//int x2 = de;
		//System.out.println(x2);
		
		double y = de.doubleValue();
		System.out.println(y);
		double y2 = de;//auto unboxing
		System.out.println(y2);
		
		//int <- String
		int a = Integer.parseInt(data);
		System.out.println("a=" + a);
		
		//byte <- String
		byte b = Byte.parseByte(data);
		System.out.println("b=" + b);
		
		//double <- String
		double c = Double.parseDouble(data);
		System.out.println("c=" + c);
		
		boolean numBoolean = Boolean.parseBoolean(data);//false
		System.out.println("numBoolean:" + numBoolean);
		
		numBoolean = Boolean.parseBoolean("true");
		System.out.println("numBoolean:" + numBoolean);//true
		
		numBoolean = Boolean.parseBoolean("false");
		System.out.println("numBoolean:" + numBoolean);//false
		
		String ss = String.valueOf(1);
		System.out.println(ss);
		Double da = Double.valueOf("1");
		System.out.println(da);
		double dt = da;//auto unboxing?
		System.out.println(dt);
		
		int k = 10;
		Integer in = new Integer(k);
		Integer is = k;//auto unboxing
		System.out.println(is);
		
		int m = is; //auto unboxing
		
		///////////////////////////////////
		double dm = 5.4;
		Double valDouble = dm;//auto boxing
		double dn =valDouble;//auto unboxing
		
		String ko ="90";
		Double dp = Double.valueOf(ko);//Double <- String
		String kt = dp.toString();//String <-Double
		double kd = Double.parseDouble(ko); //double <-String
	}
}
