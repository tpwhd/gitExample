package ch05;

public class Array2Point2 {

	public static void main(String[] args) {
		int[][] score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < score.length; i++) {
			int sum = 0; //총점
			float avg = 0.0f; //평균
			
			System.out.printf("%d\t", i + 1); //번호출력
			for(int j = 0; j < score[i].length; j++) { //국영수 배열값 출력
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
			}
			avg = sum/(float)score[i].length; //평균계산
			
			System.out.printf("%d\t %.1f\n", sum, avg);
		}
		
	}
}
