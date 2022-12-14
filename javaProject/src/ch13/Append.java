package ch13;

public class Append {

	public static void main(String[] args) {
		//불변
		String a = "hello";
		System.out.println(System.identityHashCode(a));
		a = a + " java";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		//가변형
		System.out.println("===가변형 String Builder===");
		StringBuilder b = new StringBuilder("hello");
		System.out.println(System.identityHashCode(b));
		b.append("java");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
	}
}
