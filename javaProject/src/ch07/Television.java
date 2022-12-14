package ch07;

public class Television {
	//멤버 변수(전역,필드)
	int channel; //채널 = 7 | 다른 메모리에 12 ★주소값이 다름★
	int volume; //볼륨 = 12 | 다른 메모리에 13
	boolean onOff; //전원 상태 true | 다른 메모리에 false
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	int getChannel() {
		return channel;
	}
	
	int setChannel(int ch) {
		channel = ch;
		return channel;}
}
