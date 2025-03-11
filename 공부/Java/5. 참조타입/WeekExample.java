package ch05ref;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		
		// Week enum 안에 요일 변수들을 사용해야한다.
		System.out.println(Week.MONDAY);
		// 오늘의 요일을 구하자.
		Week today = null;

		// 요일 이름을 저장하는 문자열 배열을 선언
		String[] weekName = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일",};
		
		// 오늘 날짜와 시간 정보 객체 만들기 - Date, Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// 요일 정보를 꺼내 보자.
		System.out.println("요일 정보의 위치 : " + Calendar.DAY_OF_WEEK);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 1 - 일, ... 5 - 목
		System.out.println("요일 정보 : " + week);
		
		// switch문을 사용하여 week의 값에 따라 Calendar.DAY_OF_WEEK로부터 얻어음
		switch (week) {
		case 1: // 일요일
			// today = "SUNDAY";
			today = Week.SUNDAY;
			break;

		case 2: // 월요일
			today = Week.SUNDAY;
			break;
			
		case 3: // 화요일
			today = Week.TUESDAY;
			break;
			
		case 4: // 수요일
			today = Week.WEDNESDAY;
			break;
			
		case 5: // 목요일
			today = Week.THURSDAY;
			break;
			
		case 6: // 금요일
			today = Week.FRIDAY;
			break;
			
		case 7: // 토요일
			today = Week.SATURDAY;
			break;
		}
		
		// 처리된 요일 출력
		System.out.println(today);
		
		if(today == Week.THURSDAY) System.out.println("목요일 입니다.");
		
		// 표기할 요일 출력
		System.out.println(weekName[week]);
	} // end of main()
} // end of class
