package Assign1129;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTaxEx {
	
	public static double  valueOfSupply; //공급가액
	public static int vatRate = 10; //부가세율
	public static double getVat() { //부가세계산
		return valueOfSupply / vatRate;
	}
	public static double getTotal() { //부가세 포함 합계
		return valueOfSupply + getVat();
	}
	
	
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.println("공금가액을 입력하세요 : ");
		ValueAddedTaxEx.valueOfSupply = Integer.parseInt(sc.nextLine());
		System.out.println("******************************************");
		System.out.println("공급가액 : " + decFormat.format((int)valueOfSupply) + "원");
		System.out.println("부가가치세율 : " + vatRate + "%");
		try { //오류가 날 수도 있는 코드 입력
			System.out.println("부가가치세 : " + decFormat.format((int)getVat() + "원"));
			System.out.println("합계 : " + decFormat.format((int)getTotal() + "원"));
			
		} catch (Exception e) { //오류가난 후에 정정(?) 코드 입력
			System.out.println("프로그램 실행 중 문제가 발생했습니다.");
			System.out.println("프로그램 수정 후 계산 값을 출력합니다.");
			System.out.println("부가가치세 : " +decFormat.format((int)getVat()) + "원");
			
			//decFormat.format((int)getVat() + "원")) > decFormat.format((int)getVat()) + "원") 로 수정
			
			System.out.println("합계 :" + decFormat.format((int)getTotal()) + "원");
		System.out.println("******************************************");
		//박종찬님것 카피
		sc.close();
		}
	}
}