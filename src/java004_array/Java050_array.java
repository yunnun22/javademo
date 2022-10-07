package java004_array;
//1 2
//3 4 5
//6 7 8 9 10
//결과값이다른디? 잘못따라함
public class Java050_array {

	public static void main(String[] args) {
		// 가변배열을 생성할떄는 제일 마지막의 배열크기는 지정하지 않는다.
		// 가변배열을 제공하는 이유는 메모리 손실을 최소화 하기 위한 목적이다.
//
//		int[][] num = new int[3][];
//		num[0] = new int[2];// 0행2열이 생성
//		num[1] = new int[3];// 1행 3열 생성
//		num[2] = new int[5];// 2행 5열이 생성
		
		int[][] num = new int [][] {{1,2},{3,4,5},{6,7,8,9,10}};

		for (int i = 0; i<num.length; i++) {
			for (int j = 0; j<num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			}
		}
		System.out.println();

	}

}
