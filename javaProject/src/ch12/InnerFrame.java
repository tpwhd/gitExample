package ch12;

import java.awt.Frame; //GUI전용 클래스
//Frame : 윈도우 창을 띄워주는 클래스
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//무명내부클래스를 주로 사용하는 프로그램인 GUI 프로그램
public class InnerFrame extends Frame {
	public InnerFrame() {
		super("내부 클래스 테스트"); //부모 생성자 호출 겸 제목처리
		setSize(300, 400); //가로, 세로 초기사이즈 설정
		setVisible(true); //프레임을 화면에 표시
		
	}
	public static void main(String[] args) {
		InnerFrame e = new InnerFrame();
		e.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			//윈도우창이 닫힐 때 자동호출([x] 버튼을 누를 때)
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
