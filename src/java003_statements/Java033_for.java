package java003_statements;
/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올때(break)
 * 반복문에서 label을 선언하고 호출하면된다.
 */
public class Java033_for {

	public static void main(String[] args) {
		move://label선언
		for(int k=1;k<5;k++) {
			go://label선언
			for(int i=1;i<=3;i++) {
				for(int j=1;j<=2;j++) {
					//break move;
					//continue move;
					//break go;
					break;
				}System.out.printf("i=%d\n",i);
			}System.out.println("kkk");
		}System.out.println("program end");

	}

}
