package ch05;

public class StringArray {

	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "HTML"};
		//정식문법으로도 바꿔보세요
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
				
			
		}
		//확장 for문(향상된for문, for~each문) => jdk 1.5이상부터 사용가능
		//for(개별값 저장 변수 : 집합변수){ }
		for(String ss : str) {
			System.out.println(ss);
		}
		

	}

}
