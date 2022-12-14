package ch06;

//메서드 사용
public class MethodEx2 {

	//메인 메서드(프로그램의 시작이자 끝)(
	public static void main(String[] args) {
		System.out.println("합(1~10) : " + sum(1,10));
		System.out.println("합(10~100) : " + sum(10,100));
		System.out.println("합(100~1000) : " + sum(100,1000));
	} //main

	//사용자정의 메서드
	public static int sum(int a, int b) { //a=1, b=10
		int sum = 0; //반환용도(초기화)
		for(int i = a; i <= b; i++) {
			sum += i;
			
		} //for
		return sum;
	}
}
