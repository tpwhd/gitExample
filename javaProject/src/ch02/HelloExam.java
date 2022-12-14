package ch02;

/* 이 프로그램은 가장 기본이 되는 클래스 구조
아무리 코드가 복잡해도 해당 구조에서 벗어나지 않음 */

//클래스 이름은 대문자로 시작
public class HelloExam {
	//전역변수(멤버변수) : 클래스와 메소드 사이에 선언된 변수
	
	
	//메소드 이름은 소문자로 시작
	public static int sum(int n, int m) {//n = 20, m = 10
		return n+m; //30
	}
    public static int sum2(int n, int m) {//n = 20, m = 10
	    return n+m; //30
		
	}
	
	//실행되는 메인 메소드(=함수)
	public static void main(String [] args) {
		//지역변수 메소드 안에 선언된 변수
		int i = 20; //지역변수 초기화(값을 저장, 변수에 할당한다)
	    int s; //지역변수 선언	(좌변 = 그릇, 우변 = 재료)
	    char a; //지역변수 선언
	    
	    s = sum(i, 10); //s=30
	    double s2 = sum2(30, 10);
	    a = '?'; //단문자는 작은따옴표'', 단어 문자는 큰 따옴표 ""룰 쓴다
	    System.out.println(a);
	    System.out.println("Hello");
	    System.out.println(s);
	    System.out.println(s2);
	}

}
 