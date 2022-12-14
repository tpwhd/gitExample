package ch03;

public class BItNot {
    public static void main(String[] args) {
	    //~연산자(비트값을 반전 0을 1로, 1을 0으로)
    	//계산시 첫째로  반전 시키고 다시 한번 반전시킬 때 오른쪽 끝비트를 제외하고 반전시킨 후
    	//앞의 부호도 반전시킨다.
    	byte a = 10;
    	System.out.println(a);
    	System.out.println(~a);
}
}
