package ch03;

public class CastEx {
//자료형변환
	public static void main(String[] args) {
		float f = 1.6f; //4바이트로 저장
		System.out.println(f);
		
		f = 100; //자동형변환(정수 100을 자동으로 float형 실수 100.0f로 변환
		System.out.println(f);
		
		f = 100.5f;
		int i = (int)f; //강제형변(값이 손실 될 수 있음)
		System.out.println(i);
	}

}
