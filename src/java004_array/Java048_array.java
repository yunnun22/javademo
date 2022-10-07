package java004_array;
/*
 *   1 2 3 4 5
 *  10 9 8 7 6 
 *  11 12 13 14 15
 *  20 19 18 17 16
 *///======================못따라함================================
public class Java048_array {

	public static void main(String[] args) {
		int[][]num= {{1, 2, 3, 4, 5,},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20}};
		
		for(int i=0; i<4; i++) { //i=1
			for (int j=0; j<5; j++) { //j=0
				if (i%2==1) {
					System.out.printf("%4d",num[i][num[i].length-i-j] );
					
				}else {
					System.out.printf("%4d",num[i][j]);;
				}
			}
		}
		
		
		
		
	}

}
