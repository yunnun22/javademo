package ncs.test01;

public class ArrayTest {
	public static void main(String[] args) {

		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 } };

		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;

			}}
			avg = sum /cnt;

			System.out.println("총합 : " + sum);
			System.out.println("평균 : " + avg);

		}
	}
