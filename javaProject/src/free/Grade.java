package free;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
		
    	int kor = 0, eng = 0 , mat = 0;
		char kgrade, egrade, mgrade = ' ';
		char lev = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수는? : ");
	    kor = sc.nextInt();
	    System.out.print("영어 점수는? : ");
	    eng = sc.nextInt();
	    System.out.print("수학 점수는? : ");
	    mat = sc.nextInt();
	    sc.close();
	    
	 
	    if(kor > 90) {
	    	kgrade = 'A';
	    	if(kor > 97) {
	    		lev = '+';
	    	}else if (kor > 94) {
	    		lev = '-';
	    	}
	    }else if(kor > 80) {
	    	kgrade = 'B';
	    	if(kor > 87) {
	    		lev = '+';
	    	}else if (kor > 84) {
	    		lev = '-';
	    	}
	    }else {
	    	kgrade = 'F';
	    }
	    
	    
	    
	    
	    if(eng > 90) {
	    	egrade = 'A';
	    	if(eng > 97) {
	    		lev = '+';
	    	}else if (eng > 94) {
	    		lev = '-';
	    	}
	    }else if(eng > 80) {
	    	egrade = 'B';
	    	if(eng > 87) {
	    		lev = '+';
	    	}else if (eng > 84) {
	    		lev = '-';
	    	}
	    }else {
	    	egrade = 'F';
	    }
	    
	    
	    
	    
	    if(mat > 90) {
	    	mgrade = 'A';
	    	if(mat > 97) {
	    		lev = '+';
	    	}else if (mat > 94) {
	    		lev = '-';
	    	}
	    }else if(mat > 80) {
	    	mgrade = 'B';
	    	if(mat > 87) {
	    		lev = '+';
	    	}else if (mat > 84) {
	    		lev = '-';
	    	}
	    }else {
	    	mgrade = 'F';
	    }
	    
	    System.out.println("국어\t영어\t수학");
	    System.out.println(kor + "\t" + eng + "\t" + mat);
	    System.out.println("==================================");
	    System.out.println("국어 등급\t\t영어 등급\t\t수학 등급");
	    System.out.println(kgrade + lev + "\t\t" + egrade + lev + "\t\t" + mgrade + lev);
	    
	    		
	}
}
