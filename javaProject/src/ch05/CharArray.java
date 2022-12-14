package ch05;

public class CharArray {

	public static void main(String[] args) {
		//char[] ch = {'J','a','v','a'};
		char[] ch = new char[5];
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열참조변수.length => 배열의 사이즈
		for(int i = 0; i < ch.length; i++) {
			System.out.println(i + "번째 문자 : " + ch[i]);
		}
	}
}
