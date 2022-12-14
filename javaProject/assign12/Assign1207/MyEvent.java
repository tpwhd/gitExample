package Assign1207;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;



public class MyEvent extends JFrame{
	private JButton button1,button2,button3,button4,button5,button6;
	public MyEvent() {
		//플로우 레이아웃으로 변경
		setLayout(new BorderLayout());
		button1 = new JButton("Red");//버튼 생성
		button2 = new JButton("Green");
		button3 = new JButton("Blue");
		button4 = new JButton("Yellow");
		
		//프레임에 버튼을 붙임
		add(button1); add(button2); add(button3); add(button4); 
		
		button1.addActionListener(new MyEventColor(this, Color.RED));//이벤트 핸들러를
		//외부클래스 생성 및 호출을 통해서 구현
		//this는 EventEx2 자신의 객체를 가리키는 것. 또한 데이터 타입으로는 JFrame이 된다.(JFrame을 상속받았기 때문)
		button2.addActionListener(new MyEventColor(this, Color.GREEN));
		button3.addActionListener(new MyEventColor(this, Color.BLUE));
		button4.addActionListener(new MyEventColor(this, Color.WHITE));
		
		
		//버튼을 누르면 MyColorAction에서 구현한 actionPerformed()가 자동 호출된다.
		//버튼에 이벤트 기능 추가
		add(button1, "East");//East영역에 배치
		add(button2, "West");
		add(button3, "South");
		add(button4, "North");
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//현재 창만 닫음
	}
	
	public static void main(String[] args) {
		new MyEvent();
	}

}
