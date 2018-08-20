package etc;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// 1986년 5월 5일을 Calendar 객체로 만들기
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, 1987);
		birth.set(Calendar.MONTH, 5);
		birth.set(Calendar.DAY_OF_MONTH, 25);
		//System.out.println(birth);
		//Date date = new Date(birth.getTimeInMillis());
		//system.out.println(date);
		
		Calendar toDay = Calendar.getInstance();
		long gap =
				toDay.getTimeInMillis() - birth.getTimeInMillis();
		System.out.println("태어난지" + (gap/24/60/60/1000) + "일째 되는 날 입니다.");
		

	}

}
