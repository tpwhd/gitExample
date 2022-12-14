package Assign1107;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("==========================");
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		byte w = in.nextByte();
		System.out.println("직사강형의 세로 길이를 입력하세요 : ");
		byte v = in.nextByte();
		System.out.println("직사강형의 넓이는 " + w * v + "입니다.");
		System.out.println("==========================");
		
		in.close();
	}

}
