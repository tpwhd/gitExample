package ch13;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));;
		System.out.println(Math.round(10.5));
		System.out.println(Math.floor(10.9));
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.pow(2, 3));
		Random rand = new Random();
		
		System.out.println("정수값 : " + rand.nextInt(100)); //100이하의 랜덤 정수 발생
		System.out.println("실수값 : " + rand.nextDouble()); //1이하의 랜덤 실수 발생
		
		int a = 10;
		
		Integer b = 20; //객체자료형(Wraaper 클래스), 엣버전에서는 에러, IntValue()가 작동
		Integer c = new Integer(30); //정식 문법
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());
		
	}
}
