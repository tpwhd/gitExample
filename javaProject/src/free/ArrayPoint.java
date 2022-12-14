package free;

import java.util.Scanner;

public class ArrayPoint {
    public static void main(String[] args) {
		int[] kor = {0,0,0};
		int[] eng = {0,0,0};
		int[] mat = {0,0,0};
		int[] tot = {0,0,0};
		double [] avg = {0.0d,0.0d};
		double tavg = 0.0d;
		String[] name = {"",""};
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3명의 학생의 국영수 점수를 입력하세요.");
		for(int i = 0; i > name.length; i++) {
		System.out.println("이름 : ");
		name[i] = sc.next();	
		System.out.println("국어 : ");
		kor[i] = sc.nextInt();
		System.out.println("영어 : ");
		eng[i] = sc.nextInt();
		System.out.println("수학 : ");
		
		mat[i] = sc.nextInt();
		result += name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + tot[i] + "\t" + String.format("%.2f", avg[i]) + "\n";
		 }
		sc.close();
    }
}
