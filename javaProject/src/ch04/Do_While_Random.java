package ch04;

import java.util.Scanner;

public class Do_While_Random {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		answer = (int)(Math.random()*100)+1; //1~10사이에 임의의 수를 발생
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1과 100사이의 정수를 입력하세요 > ");
			String tmp = scanner.next(); //사용자가 문자형으로 자료입력
			input = Integer.parseInt(tmp); //문자형을 숫자형으로 변환
		    if (input > answer) {
		    	System.out.print("더 작은 수로 다시  시도해보세요.");
		    }else if(input < answer) {
		    	System.out.println("더 큰 수로 다시 시도해보세요.");
		    }
		}while(input != answer);
		scanner.close();
		System.out.println("정답입니다.");
		
		
		
		
	}

}
