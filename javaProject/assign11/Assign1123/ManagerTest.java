package Assign1123;

public class ManagerTest {
	public static void main(String[] args) {
	Manager m1 = new Manager();
	m1.setName("홍길동");
	m1.setNum(20220101);
	m1.setRrn("123456-1234567");
	m1.input("서울 강남구", "hong@gmail.com", 3000);
	m1.showInfo();
	}
}
