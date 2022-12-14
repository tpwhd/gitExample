package Assign1107;

public class MyNameUnicode {

	public static void main(String[] args) {
		String a = " ";
		
		System.out.println("==========================");
		System.out.print("\uC774");
		System.out.print(a);
		System.out.print("\uAC15");
		System.out.print(a);
		System.out.println("\uD638");

		System.out.println("char형(\"\\uC774\") : 이");
		System.out.println("char형(\"\\uAC15\") : 강");
		System.out.println("char형(\"\\uD638\") : 호");
		System.out.println("==========================");
		
		
	}

}
