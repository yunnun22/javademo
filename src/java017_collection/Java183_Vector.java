package java017_collection;

import java.util.Vector;

/*
 *[프로그램 출력결과]
 *kim   56  78   12  146
 *hong  46  100  97  243
 *park  96  56   88  240 
 */
public class Java183_Vector {

   public static void main(String[] args) {
      String path = "./src/java017_collection/score.txt";
      Vector<Sawon> vt = lines(path);
      prnDisplay(vt);
   }// end main()

   private static Vector<Sawon> lines(String filename) {
      // strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한 후
      // 리턴하는 프로그램을 구현하시오.
      return null;
   }

   private static void prnDisplay(Vector<Sawon> vt) {
      // vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.

   }

}// end class