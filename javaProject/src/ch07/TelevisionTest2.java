package ch07;

public class TelevisionTest2 {

	public static void main(String[] args) {
		Television myTv = new Television();
		System.out.println(myTv); //메모리 주소값 출력(해쉬코드)
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		System.out.println("나의 텔레비전의 채널을 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
		
		
		//같은 객체 생성시 참조변수 이름은 달라야 한다. (★★★중요★★★)
		Television yourTv = new Television(); 
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = false;
		System.out.println("너의 텔레비전의 채널을 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
	}
}
