package java004_array;

public class Java040_array {

	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int odd = 0;// 홀수
		int even = 0;// 짝수

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				odd = odd + num[i];
			} else {
				even = even + num[i];
			}
		}
		System.out.printf("홀수:%d\n", odd);
		System.out.printf("짝수:%d\n", even);
	}
}
