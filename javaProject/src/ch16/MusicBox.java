package ch16;

public class MusicBox {//공유객체
	//가요 음악
	//메소드이름 앞에 synchronized를 붙이면 해당메소드는 객체 사용권(Monitoring Lock)을 얻는다.(권장사항)
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {//1초 이하로 쉬면서 10번반복
			System.out.println("가요 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA()
	
	//팝송 음악
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {//1초 이하로 쉬면서 10번반복
			System.out.println("팝송 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicB()
	
	//클래식 음악
	//synchronized를 붙히지 않은 메소드는 다른 스레드들이 모니터링 락을 획득했어도, 그것과 상관없이 실행된다.
	public void playMusicC() {
		for(int i=0; i<10; i++) {
			//전체 메소드에 적용안하고 특정부분만 synchronized 블럭처리를 할 수 있다.
			synchronized (this) {//this는 MusicBox객체 자신을 가리킴
				System.out.println("클래식 음악!!!");
			}
			//1초 이하로 쉬면서 10번반복
			//System.out.println("클래식 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicC()
}
