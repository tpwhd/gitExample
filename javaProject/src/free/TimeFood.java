package free;

public class TimeFood {
	public static void main(String[] args) {
		
		boolean didLunch = true;
		int thisTime = 13;

		if( ( thisTime >= 13 && thisTime < 14 ) || (  thisTime > 13 && didLunch == false) ){
			System.out.println("밥을먹는다");
		}else{
			System.out.println("밥을먹지 않는다");
		}
	}
}
