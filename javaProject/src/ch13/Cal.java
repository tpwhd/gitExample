package ch13;

import java.sql.Date;
import java.util.Calendar;

public class Cal {

	public static void main(String[] args) {
		//Calendar 인스턴스 생성은 new로 만들지 않는다. (static은 클래스이름.??로 호출)
		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get(Calendar.YEAR) + "년 ");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");
		System.out.print(cal.get(Calendar.DATE) + "일 ");
		System.out.print(cal.get(Calendar.AM_PM)); //오전 0, 오후 1
		if(cal.get(Calendar.AM_PM) == 0) System.out.print("오전 ");
		else System.out.print("오후 ");
		System.out.print(cal.get(Calendar.HOUR) + "시 ");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "시 ");
		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
		System.out.print(cal.get(Calendar.SECOND) + "초 ");
		String yoil = "";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1 : yoil = "일요일"; 	break;
		case 2 : yoil = "월요일"; 	break;
		case 3 : yoil = "화요일"; 	break;
		case 4 : yoil = "수요일"; 	break;
		case 5 : yoil = "목요일"; 	break;
		case 6 : yoil = "금요일"; 	break;
		case 7 : yoil = "토요일"; 	break;
		}
		System.out.print("오늘은 " + yoil + "입니다.");
		
		//1년 중 몇번째의 날
		System.out.print(cal.get(Calendar.DAY_OF_YEAR));
		//월의 몇번쨰의 날
		System.out.print(cal.get(Calendar.DAY_OF_MONTH));
		//요일
		System.out.print(cal.get(Calendar.DAY_OF_WEEK));
		//1년중 몇번째 주
		System.out.println("이번주는 일년 중 " + cal.get(Calendar.WEEK_OF_YEAR) + "째 주 입니다.");
		
		Date date = (Date) cal.getTime();
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDate());
		
	}
}
