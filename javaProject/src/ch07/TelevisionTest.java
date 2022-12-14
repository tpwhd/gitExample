package ch07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television(); //객체 생성
		//System.out.println(tv); //주소값
		tv.channel = 7; //tv. => 인스턴스화된 Television 메모리의 주소값으로 접근
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("텔리비전의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "입니다");
		
	}
}
