package ch14;

public class Type2 {
	private Object value;
	public Object getValut() { //Object는 어떤 자료형이든 처리가능
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValut());
		//이처럼 Object로 모든 걸 처리하게 되면 내부적으로 형변환등의 처리가 많아지게 된다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
