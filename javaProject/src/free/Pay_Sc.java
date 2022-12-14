package free;

import java.util.Scanner;

public class Pay_Sc {
	static String nam;
	static int sal;
	static int bon;
	static int tot;
	static int tax;
	static int pay;
	static int pTot;
	
	public static void main(String[] args) {
		out:
		for(;;) {
		name();
		salary();
		if(sal == 0) {
			System.out.println("프로그램을 종료합니다.");
			break out;
		}
		bonus();
		total();
		tax();
		pay();
		if(sal == 0) 			break out;
		}
	}
	
	//이름
	static void name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		nam = sc.next();
	}
	
	//연봉
	static void salary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연봉을 입력하세요 (프로그램 종료 => 0) : ");
		sal = sc.nextInt();
sc.close();	}
	
	//보너스
	static void bonus() {
		bon = (int) (sal * 0.3);
	}
	
	//총액+보너스
	static void total() {
		tot = sal + bon;
	}
	
	//세금
	static void tax() {
		tax = (int)(tot * 0.03);
	}
	
	
	//실수령액
	static void pay() {
		pay = tot - tax;
		System.out.println("이름 : " + nam);
		System.out.println("연봉 : " + sal + "만원");
		System.out.println("보너스 :" + bon + "만원");
		System.out.println("총액 : " + tot + "만원");
		System.out.println("세금 : " + tax + "만원");
		System.out.println("실수령액 :" + pay + "만원");

	}
}

