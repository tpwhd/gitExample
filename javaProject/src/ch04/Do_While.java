package ch04;

public class Do_While {

	public static void main(String[] args) {
		int i = 1; //초기식
		do { //먼저 실행
			System.out.print(i);
			i++;
			
		}while (i <= 10); //조건식을 나중에 검사, @주의점@ do~while문에서 while(); 세미콜론 반드시 찍어야 함.
		
		
		

	}

}
