package ch02;

public class PrintfEx {

	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "java";
		double f = 3.14d;
		
		System.out.printf("%d\n", i); //10진수
		System.out.printf("%o\n", i); //8진수
		System.out.printf("%x\n", i); //16진수
		System.out.printf("%c\n", i); //문자
		System.out.printf("%5d\n", d); //5자리, 빈자리는 공백처리한다.
		System.out.printf("%-5d\n", d); //5자리, 빈자리는 공백처리한다.(왼쪽정렬)
		System.out.printf("%05d\n", d); 
		System.out.printf("%,d\n", d); //3자리마다 콤마처리
		System.out.printf("%s\n", s); 
		System.out.printf("%5s\n", s); 
		System.out.printf("%-5s\n", s); 
		System.out.printf("%f\n", f); 
		System.out.printf("%e\n", f); 
		System.out.printf("%4.1f\n", f); 
		System.out.println(String.format("%4.1f", f)); 
		System.out.printf("%.1f\n", f); //전체자리수는 정하지 않고 소수점 1째자리까지만 지정 
		System.out.printf("%04.1f\n", f); 
		System.out.printf("%-4.1f\n", f); 
		
	
		
	}

}
