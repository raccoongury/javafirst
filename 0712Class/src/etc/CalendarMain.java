package etc;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// 1986�� 5�� 5���� Calendar ��ü�� �����
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
		System.out.println("�¾��" + (gap/24/60/60/1000) + "��° �Ǵ� �� �Դϴ�.");
		

	}

}
