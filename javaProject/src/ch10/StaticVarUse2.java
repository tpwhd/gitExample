package ch10;

public class StaticVarUse2 {

	public static void main(String[] args) {
		//static => 클래스이름으로 접근할 수 있다. 객체생성 X
		System.out.println(StaticVar2.total);
		
		StaticVar2 car1 = new StaticVar2("쏘나타"); //인스턴스 생성겸 매걔변수가 있는 생성자 호출
		StaticVar2 car2 = new StaticVar2("모닝");
		StaticVar2 car3 = new StaticVar2("아반떼");
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);
	}
}
