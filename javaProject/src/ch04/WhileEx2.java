package ch04;

public class WhileEx2 {
    public static void main(String[] args) {
    	int i = 1;
    	int num = 10;
    	int sum = 0;
    	while (i <= num) {
    		sum = sum + i; //sum += i;
    		i++; //증감식
    		//sum += i++; (위에 것들을 한번에 이렇게 표현)
    	}
    	System.out.println("1~" + num + "까지의 합계 : " + sum);
}
}
