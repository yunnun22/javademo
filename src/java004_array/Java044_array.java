package java004_array;

//변환
//12         123
//34         246
//56
public class Java044_array {

	public static void main(String[] args) {
		// 3행 2열의 2차원 배열
		// int[][] num = {{1,2},{3,4},{5,6}};
		int[][] num = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
		System.out.println("=================================================");

		for (int col = 0; col < 2; col++) {
			for (int row = 0; row < num.length; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
		System.out.println("========개많아 이밑에꺼 못따라함====하나하나하는건디========");
		System.out.printf("%4d", num[0][0]);
		System.out.printf("%4d", num[1][0]);
		System.out.printf("%4d", num[2][0]);
		System.out.println();
		System.out.printf("%4d", num[0][1]);
		System.out.printf("%4d", num[1][2]);
		System.out.printf("%4d", num[2][1]);
		System.out.println();
		
		System.out.println("========개많아 이밑에꺼 못따라함====하나하나하는건디========");
		
		System.out.println("========개많아 이밑에꺼 못따라함====하나하나하는건디========");
	}
}
