package Assign1109;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		int kor = 0,  eng = 0,  mat = 0,  tot = 0;
		int i;
		double avg = 0.0d;
	    char grade = ' '; 
	    
		Scanner scan = new Scanner(System.in);
		
		for(int q = 0; q < 3; q++) {
		System.out.print("국어 점수 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		mat = scan.nextInt();
		}
		
		scan.close();
		
		tot = kor + eng + mat;
		avg = tot / 3.0d;
		
		if(avg > 90) {
			grade = '수';
		}else if (avg > 80) {
			grade = '우';
		}else if (avg > 70) {
			grade = '미';
		}else if (avg > 60) {
			grade = '양';
		}else if (avg > 50) {
			grade = '가';
		}
		
		for(i = 0; i < 3; i++) {
			System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
			System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg + "\t" + grade);
		   }
		
	}
	
}
