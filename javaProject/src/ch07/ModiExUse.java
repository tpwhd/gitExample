package ch07;

import ch06.ModiEx;

public class ModiExUse extends ModiEx {
	//상속관계를 자세히 다룰예정
	//상속관계에 있어서 부모크래스가 아닌 자식클래스를 인스턴스화 해야함
	
	public static void main(String[] args) {
		ModiExUse me = new ModiExUse();
		System.out.println(me.name);
	}
}
