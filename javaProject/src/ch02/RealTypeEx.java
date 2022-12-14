package ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double e = 1234E-4; //1234E-4 = 1234 x 10 - 4 이므로 0.1234와 동일
		double d = 0.1234d; //double은 숫자뒤에 D나 d를 써야하지만 생략가능.
		float f = 0.1234f; //float형은 만큼은 숫자 뒤에 F 또는 f를 꼭 명시해야 한다.
        double w = .1234D; //.1234sms 0.1234이다.		

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(w);
	}
}
