package Assign1109;

import java.util.Scanner;

public class ForPoint_Ex {
    public static void main(String[] args) {
    	int kor;
    	int eng;
    	int mat;
    	int tot;
    	double avg;
    	String grade = "";
    	String result = ""; //점수 출력용
    	
    	Scanner scan = new Scanner(System.in);
    	for(int i = 1; i <= 3; i++) {
    		System.out.print("국어 점수 : ");
    		kor = scan.nextInt();
    		System.out.print("영어 점수 : ");
    		eng = scan.nextInt();
    		System.out.print("수학 점수 : ");
    		mat = scan.nextInt();
    		tot = kor + eng + mat;
    		avg = tot / 3.0d;
    		
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
    		+ String.format("%.1f", avg) + "\t" + grade + "\n"; //문자열을 누적 시키는 기법
    		
    	}//for
    	
      //출력
     System.out.println("===================================================");
     System.out.println("국어/t영어/t수학/t총점/t평균/t등급");
     System.out.println("---------------------------------------------------");
     System.out.println(result);
     System.out.println("===================================================");
     scan.close();
    }
}
