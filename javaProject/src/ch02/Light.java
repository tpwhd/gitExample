package ch02;

public class Light {
	public static void main(String[] args) {
		//long타입은 8바이트(64비트) 정수를 저장

		long lightSpeed;
		long distance;
		
		lightSpeed = 300000; //L,l은 생략가능
		distance = lightSpeed * 365 * 24 * 60 * 60;
		
		System.out.println(distance);
//빛이 1년 동안 가는 거리 : 빛의 속도 * 365일 * 24시 * 60분 *60초 
		
	}

}
