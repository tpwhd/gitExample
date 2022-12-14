package ch04;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		System.out.println("홀수를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i <= num / 2) { //위쪽 영역
					if(i + j <= num / 2 - 1) { //왼쪽 공백찍기
						System.out.print(" ");
					}else if (j - i >= num / 2 + 1 ) { //오른쪽 공백
						System.out.print(" ");
					}else {
						System.out.print("*");
					}//inner if else
				}else if (i > num / 2) { //아래쪽 영역
					if(i - j >= num / 2 + 1) { //왼쪽 공백 찍기
						System.out.print(" ");
					}else if (i + j >= num / 2 * 3 + 1) { //오른쪽 공백
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}//out if esle
			}//inner for
			System.out.println();
		}//out for
		sc.close();
	}

}
