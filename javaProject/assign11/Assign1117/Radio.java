package Assign1117;

public class Radio {
	double ch;
	int vol;
	String pow = "";
	boolean onOff;
	
	void bprint() {
		if(onOff == true) pow = "켜져";
		else pow = "꺼져";
		
		System.out.println("라디오가 " + pow + "있습니다\n" + "현재 채널은 " + ch + "입니다.\n"
				+ "볼륨은 " + vol + "입니다.");
	}
}
