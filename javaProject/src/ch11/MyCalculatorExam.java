package ch11;

public class MyCalculatorExam {

	public static void main(String[] args) {
		MyCalculatorExam cal = new MyCalculatorExam(); //다형성
		int value1 = cal.multiple(5, 10);
		int value2 = cal.plus(5, 10);
		int value3 = cal.exec(5, 10);
		
		System.out.println(value1);
	}

	private int exec(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int plus(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int multiple(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
