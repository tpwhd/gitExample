package Assign1110;

import java.util.Scanner;

public class While_HakjumEx {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double avg;
		String grade = "";
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 성적 입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.println("아무 정수나 입력하세요 : ");
		int n = sc.nextInt();
		while (n != -1) { //-1이 입력되면 while문을 벗어남
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			mat = sc.nextInt();
			tot = kor + eng + mat;
			avg = tot / 3;
			if ( avg >= 90) {
				grade = "수";
			}else if (avg >= 80) {
				grade = "우";
			}else if (avg >= 70) {
				grade = "미";
			}else if (avg >= 60) {
				grade = "양";
			}else {
				grade = "가";
			}
			result += kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + 
			String.format("%.1f", avg) + "\t" + grade + "\n";
			System.out.println("계속하려면 아무 정수나 입력하고, 마치려면 -1을 입력하세요. : ");
			n = sc.nextInt(); //-1입력 용도
			
		} //while
		System.out.println("====================================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("----------------------------------------------------");
		System.out.println(result);
		System.out.println("====================================================");
		sc.close();
	}//main
}//class
