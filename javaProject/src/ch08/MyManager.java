package ch08;

//싱글톤 기법
public class MyManager {
	private int score;
	
	private MyManager() {
		
	}
	private MyManager(int score) {
		this.score = score;
	}
	
	private static MyManager mgr;
	
	public static MyManager getInstance() {
		if(mgr == null) { //처음 MyManager가 객체화 되었을 때
			mgr = new MyManager(10);
		}
		return mgr; //한번이상 객체 생성 되었다면(즉, 주소값이 있으면) 그 값을 리턴
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
