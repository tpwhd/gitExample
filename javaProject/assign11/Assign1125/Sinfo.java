package Assign1125;

public class Sinfo implements Student {
	String name = "홍길동";
	String address = "서울 강남구";
	String email = "hong@gmail.com";
	int kor = 90, eng = 85, mat = 79, tot;
	double avg;
	
	
	public void address() {
		System.out.println("===========================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name + "\t" + address + "\t" + email);
		
	}

	public void point() {
		
		tot = kor + eng + mat;
		avg = tot / 3;
		
		System.out.println("===============================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + 
		tot + "\t" + avg);
		
		
		

	}

}
