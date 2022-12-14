package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		int[] num = {23,41,41,51,52,25,14,1,16,16,12};
		Arrays.sort(num); //기본적으로 오름차순 정렬을 해준다.
		for(int i : num) System.out.print(i + " ");
	    System.out.println();
	    System.out.println("========================");
	    
	    //내림차순은 특별히 Integer라는 Wrapper Class타입으로 데이터 처리가 되어야하고
	    //Collections.reverseOrder()라는 메소드를 써서 처리해야한다.
	    Integer rev[] = {23,41,41,51,52,25,14,1,16,16,12};
	    Arrays.sort(rev, Collections.reverseOrder());
	    for(int i : rev) System.out.print(i + " ");
	    
	}

}
