package Assign1207;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("텍스트필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(new GridLayout(4, 1));//1행 3열
		c.add(new JLabel("ID"));
		c.add(new JTextField("hong", 20)); //필드크기 20
		c.add(new JLabel("비번"));
		c.add(new JPasswordField(20));
		c.add(new JLabel("이메일"));
		c.add(new JTextField("hong@daum.net", 20));
		c.add(new JLabel("HP"));
		c.add(new JTextField("010-1234-5678 ", 20));
		
		setSize(500, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyGridLayout();
	}
	
}
