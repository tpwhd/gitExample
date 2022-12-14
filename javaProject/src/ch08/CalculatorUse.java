package ch08;

public class CalculatorUse {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //객체생성과 동시에 기본생성자를 호출
		//입력
		c1.setLeft(10);
		c1.setRight(20);
		
		//출력
		System.out.println(c1.getLeft());
		System.out.println(c1.getRight());
		c1.sum();
		c1.avg();
		
		System.out.println();
		
		Calculator c2 = new Calculator(10, 20); //갱체생성과 동시에 매걔변수가 있는 생성자를 호출
		System.out.println(c2.getLeft());
		System.out.println(c2.getRight());
		c2.sum();
		c2.avg();
		
		System.out.println();
		
		Calculator c3 = new Calculator(20, 40); //갱체생성과 동시에 매걔변수가 있는 생성자를 호출
		System.out.println(c3.getLeft());
		System.out.println(c3.getRight());
		c3.sum();
		c3.avg();
		
	}//프로그램 종료
}
