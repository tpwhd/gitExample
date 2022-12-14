package ch05;

public class ArrayBasic {

	public static void main(String[] args) {
	    //int[] score; //배열참조변수 선언
	    //score = new int[5]; //new 를 통해 메모리에 5개의 int형 
		//배열생성(4byte x 5 = 20byte)
		
		
		//int[] score = new int[5]; 이렇게도 가능
		
		int[] score = {100,90,80,60,70}; //실무기법
		
		System.out.println(score); //score는 메모리의 주소값을 가르키는 참조변수가 된다.
		
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 60;
		score[4] = 70;
		//score[5] = 90; //범위초과, 이클립스는 범위초과 오류를 못잡기 때문에 조심.
		
	//	System.out.println(score[0]);
	//	System.out.println(score[1]);
	//	System.out.println(score[2]);
	//	System.out.println(score[3]);
	//	System.out.println(score[4]);
	//	System.out.println(score[5]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
	}
}
