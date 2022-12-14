package ch13;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {

	public static void main(String[] args) {
		Integer arr[] = {3, 29, 46, 15, 89, -29};
		System.out.print("배열 데이터 : ");
		for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + "\t");
		
		//오름차순 정렬
		System.out.print("\n오름차순 정렬 : ");
		Arrays.sort(arr); //sort()가 오름차순 정렬을 해줌
		for(int i : arr) System.out.print(i + "\t");
	
		//내림차순 정렬
		System.out.print("\n내림차순 정렬 : ");
		Arrays.sort(arr, Collections.reverseOrder()); //sort()가 오름차순 정렬을 해줌
		for(int i : arr) System.out.print(i + "\t");
		
	
	
	}
}
