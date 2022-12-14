package Assign1110;

import java.util.Scanner;

public class While_Hakjum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		String result = "";
		String grade = "";
		
		while (i < 3) {
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3;
		
		
		if(avg >= 90) {
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
		
		result += kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" 
	    		+ String.format("%.1f", avg) + "\t" + grade + "\n";
		i++;
		

	    } //while 문
		
		 System.out.println("===================================================");
	     System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
	     System.out.println("---------------------------------------------------");
	     System.out.println(result);
	     System.out.println("===================================================");
	     sc.close();
		
    }
}