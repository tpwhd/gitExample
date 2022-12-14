package free;

import java.util.Scanner;

public class Olympics {

	public static void main(String[] args) {
		
		String jname, jname2, rname, rname2, tname, tname2, bname, bname2;
		double jum , jum2 , run , run2 , thr , thr2 , bik , bik2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("제자리 멀리뛰기 선수 1 : ");
		jname = scan.next(); //일강호
		System.out.print("제자리 멀리뛰기 1 M : ");
		jum = scan.nextDouble();	
		System.out.print("제자리 멀리뛰기 2 선수 : ");
		jname2 = scan.next(); //이강호
		System.out.print("제자리 멀리뛰기 2 M : ");
		jum2 = scan.nextDouble();	
		
		System.out.print("100M 달리기 선수 1 : ");
		rname = scan.next();
		System.out.print("100M 달리기 시간 1 : ");
		run = scan.nextDouble();
		System.out.print("100M 달리기 선수 2 : ");
		rname2 = scan.next();
		System.out.print("100M 달리기 시간 2 : ");
		run2 = scan.nextDouble();
		
		System.out.print("투포환 선수 1 : ");
		tname = scan.next();
		System.out.print("투포환 던지기 1 M : ");
		thr = scan.nextDouble();
		System.out.print("투포환 선수 2 : ");
		tname2 = scan.next();
		System.out.print("투포환 던지기 2 M : ");
		thr2= scan.nextDouble();
		
		System.out.print("단거리 자전거 1 선수 : ");
		bname = scan.next();
		System.out.print("단거리 자전거 1 시간 : ");
		bik = scan.nextDouble();
		System.out.print("단거리 자전거 2 선수 : ");
		bname2 = scan.next();
		System.out.print("단거리 자전거 2 시간 : ");
		bik2= scan.nextDouble();
		
		scan.close();
		
		
		
		if (jum > jum2) {
			System.out.println("제자리 멀리뛰기 1위 "+ jname +", 2위 " + jname2);
	    }
		else if (jum2 > jum) {
			System.out.println("제자리 멀리뛰기 1위 "+ jname2 +", 2위 " + jname);
			
		}
		else if (jum == jum2) {
			System.out.println("제자리 멀리뛰기 공동 1위 " + jname +",\t" + jname2 );
		}
		
		 
		
		
		

		if (run > run2) {
			System.out.println("100M 달리기 1위 "+ rname +", 2위 " + rname2);
		}
		else if (run2 > run) {
			System.out.println("100M 달리기 1위 "+ rname2 +", 2위 " + rname);
			
		}	
		else if (run == run2) {
			System.out.println("100M 달리기 공동 1위 " + rname +",\t" + rname2 );
		}
		
		
		
		
		

		if (thr > thr2) {
			System.out.println("투포환 던지기 1위 "+ tname +", 2위 " + tname2);
		}
		else if (thr2 > thr) {
			System.out.println("투포환 던지기 1위 "+ tname2 +", 2위 " + tname);
			
		}
		else if (thr == thr2) {
			System.out.println("투포환 던지기 공동 1위 " + tname +",\t" + tname);
		}


		
		

		if (bik > bik2) {
			System.out.println("단거리 자전거 1위 "+ bname +", 2위 " + bname2);
		}
		else if (bik2 > bik) {
			System.out.println("단거리 자전거 1위 "+ bname2 +", 2위 " + bname);
			
		}	
		else if (bik == bik2) {
			System.out.println("단거리 자전거 공동 1위 " + bname +",\t" + bname2 );
		}
	
	}
}

