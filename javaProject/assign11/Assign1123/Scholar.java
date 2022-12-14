package Assign1123;

public class Scholar extends Student {
		//멤버변수
		private String category; //장학금 종류
		private int money; //장학금
		
		//getter, setter
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}

		//출력
		public void print() {
			System.out.println("이름 \t 학번 \t 전공 \t 학년 \t 장학금 종류 \t 장학금");
			System.out.println(getName() + "\t " + getNum() + "\t " + getMajor() + "\t " + getYear() + "\t    " + category + "\t\t" + money + "\n");
		}
		
		//출력2
		public void print2() {
			System.out.println("이름 \t 학번 \t 전공 \t 학년");
			System.out.println(getName() + "\t " + getNum() + "\t " + getMajor() + "\t " + getYear());
		}
}
