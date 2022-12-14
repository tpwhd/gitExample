package free;

public class ChinseFood {
	public static void main(String[] args) {
		String Friend = "최근에 짜장면을 안먹음";
		String Friend1 = "배고픔";
		
		if (Friend1 == "배부름") {
			System.out.println("아무것도 먹지 않는다.");
		}
		else if (Friend == "최근에 짜장면을 먹음") {
			System.out.println("짬뽕을 먹는다");
		}
		else if (Friend != "최근에 짜장면을 먹음") {
			System.out.println("짜장면을 먹는다.");
		}
			
		
	}
}
