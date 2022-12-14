package Assign1116;

public class StudentPoint {
	//멤버변수
	static String[] name = {"홍길동", "사임당", "이순신"};
	
	static int[] num = {1001,1002,1003};
	static int[] Java = {80,90,100};
	static int[] DB = {90,99,77};
	static int[] Html = {89,60,80};
	static int[] JSP = {89,60,80};
	static int[] tot = {0,0,0};
	static double[] avg = {0.0d,0.0d,0.0d};
	
	//총점 계산
	static void getTot() {
		for(int i = 0; i < 3; i++) {
			tot[i] = Java[i] + DB[i] + Html[i] + JSP[i];
		}
	}
	
	//평균 계산
	static void getAvg() {
		for(int i = 0; i < 3; i++) {
			avg[i] = tot[i] / 3.0d;
		}
	}
	
	//출력용도
	static void print() {
		System.out.println("학번 \t 이름 \t Java \t DB \t Html \t JSP \t 총점 \t 평균");
		System.out.println("=============================================");
		for(int i = 0; i < 3; i++) {
			System.out.println(num[i] + "\t" + name[i] + "\t " + Java[i] + "\t" + DB[i] + "\t" + Html[i] + "\t" + JSP[i]  + "\t" + tot[i] + "\t" + String.format("%.1f", avg[i]));
		}
	}
	
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}
}
