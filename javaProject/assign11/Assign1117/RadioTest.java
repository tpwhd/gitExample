package Assign1117;

public class RadioTest {

	public static void main(String[] args) {
		
		Radio bRadio = new Radio(); 
			bRadio.ch = 89.1;
			bRadio.vol = 12;
			bRadio.onOff = true;
			System.out.println("[브리츠 라디오]");
			bRadio.bprint();

			System.out.println();
			
		Radio iRadio = new Radio();
			iRadio.ch = 95.1;
			iRadio.vol = 9;
			iRadio.onOff = false;
			System.out.println("[아이리버 라디오]");
			iRadio.bprint();
		
			
		
	}
}
