package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Television myTv = new Television(); //객체 생성
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
		
		
		Television yourTv = new Television(); //다른 메모리번지수에 객체생성
		yourTv.channel = 12;
		yourTv.volume = 13;
		yourTv.onOff = false;
		yourTv.print();
		
	}
}
