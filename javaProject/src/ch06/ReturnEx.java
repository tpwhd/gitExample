package ch06;

public class ReturnEx {
	//리턴 값이 있는 메소드
	public static int sum(int a) { //사용자가 정의한 메소드, a = 50
		int result = 0;
		for(int i = 1; i <= a; i++) {
			result = result + i; // result += i;
		}
		return result; //메소드를 호출한 곳으로 값을 반환함
	}
	public static void main(String[] args) {
		int n = sum(50); //sum메소드를 호출한 후 리턴 받은 값을 저장
		 System.out.println(n);
		 n = sum(100); //메소드 재사용
		 System.out.println(n);
	}
}
