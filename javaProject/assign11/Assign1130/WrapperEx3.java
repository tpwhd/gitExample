package Assign1130;

public class WrapperEx3 {
	
	public static void main(String[] args) {
		String h = "Hello 1234";
		System.out.println("-----------------------------");
		System.out.println("(Character 사용)");
		System.out.println(h.charAt(0) + "는 대문자입니다.");
		System.out.println(h.charAt(1) + "는 소문자입니다.");
		System.out.println(h.charAt(2) + "는 소문자입니다.");
		System.out.println(h.charAt(3) + "는 소문자입니다.");
		System.out.println(h.charAt(4) + "는 소문자입니다.");
		System.out.println(h.charAt(5) + "은 공백입니다.");
		System.out.println(h.charAt(6) + "는 숫자입니다.");
		System.out.println(h.charAt(7) + "는 숫자입니다.");
		System.out.println(h.charAt(8) + "는 숫자입니다.");
		System.out.println(h.charAt(9) + "는 숫자입니다.\n");
		System.out.println("(Integer 사용)");
		
		System.out.println("문자 " + Integer.toString(1234) + "입니다.");
		System.out.println("숫자 " + Integer.parseInt(h.substring(6, 10)) + "입니다.");
		Integer h2 = Integer.parseInt(h.substring(6, 10));
		System.out.println("숫자 1234 + 2 = " + (h2 + 2)  + "입니다.");
		System.out.println("-----------------------------");
	}
	
}
