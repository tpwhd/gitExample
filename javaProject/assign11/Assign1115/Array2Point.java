package Assign1115;

public class Array2Point {
    
	public static void main(String[] args) {
		int[][] point;
		point = new int[5][5]; //3행 3열 배열 생성
		point [0][0] = 10; 
		point [0][1] = 20; 
		point [0][2] = 30; 
		point [0][3] = 40; 
		point [0][4] = 50; 
		point [1][0] = 60; 
		point [1][1] = 70; 
		point [1][2] = 80; 
		point [1][3] = 90; 
		point [1][4] = 100; 
		point [2][0] = 110; 
		point [2][1] = 120; 
		point [2][2] = 130; 
		point [2][3] = 140; 
		point [2][4] = 150; 
		point [3][0] = 160; 
		point [3][1] = 170; 
		point [3][2] = 180; 
		point [3][3] = 190; 
		point [3][4] = 200; 
		point [4][0] = 210; 
		point [4][1] = 220; 
		point [4][2] = 230; 
		point [4][3] = 240; 
		point [4][4] = 250;
		

		for(int i = 0; i < point.length; i++) {
			point[i][3] = point[i][0] + point[i][1] + point[i][2];
			point[i][4] = point[i][3]/3;
					
		}
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < 5; i++) {
			System.out.println(point[i][0] + "\t" + point[i][1] + "\t" + point[i][2]+ "\t" + point[i][3] + "\t" + (double)point[i][4]);
		
	    
		}
    }
}