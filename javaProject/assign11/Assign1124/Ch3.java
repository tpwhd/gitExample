package Assign1124;

public class Ch3 extends Pa3 {
	int num = 10;
	String email = "hong@gmail";
	@Override
	public void print() { //부모쪽 print의 값을 오버라이딩해서 초기화
		System.out.println("사번 : " + num); 
		super.print(); //부모쪽 print() 호출
		System.out.println("이메일 : " + email);
	}
}
