package Assign1122;

public class Member {
	private String name;
	private String ID;
	private int pay;
	private String grade;

	public Member() {
		this("홍길동", "hong", 500000);
		if(pay >= 300000) grade = "Diamond"; 
		else if(pay >= 200000)grade = "Gold";
		else if(pay >= 100000)grade = "Silver";
		else grade = "Bronze";
	}


	public Member(String name, String ID, int pay) {
		this.name = name;
		this.ID = ID;
		this.pay = pay;
	}
	
	public void showinfo() {
		System.out.println("----------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("----------------------------");
		System.out.println(name + "\t" + ID + "\t" + pay + "\t" + grade);
		}
	}
