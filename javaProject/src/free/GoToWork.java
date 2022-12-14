package free;

public class GoToWork {
    public static void main (String [] args) {
    	
    	int kang = 1000;
        int kangTem = 30;
        		
        if (kangTem >= 40) {
        	System.out.println("강호는 집에서 쉽니다");
        }
         else if (kang >= 2500) {
    		System.out.println("강호는 택시를 탑니다.");
    	}
    	 else if (kang >= 1500) {
    		System.out.println("강호는 버스를 탑니다.");
    	}
    	 else if (kang < 1500) {
    		System.out.println("강호는 걸어 갑니다.");
    	}
    	
    	
    	
    }
}
