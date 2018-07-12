package etc;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		Date date = new Date();
		int money = 6570000;
		//0000�� 00�� 00�� ���� 00�� 00�� 00�� �������� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� EEE hh�� mm�� ss��");
		
		String msg = sdf.format(date);
		System.out.println(msg);
		
		//\6,570,00
		DecimalFormat df = new DecimalFormat("\u00A4 #, ##0");
		msg = df.format(money);
		System.out.println(msg);
	}
}
