package abstracttest;

public class WinPhone extends SmartPhone {

		@Override
		public void call() {
			int time = 132400;
			//���� ���� �� ���� �ʶ�� �����ϰ� ��ð� ��� �������� ���
			int hour = time / 3600;
			int minute = (time % 3600)/ 60;//(time - (hour * 3600)) / 60;
			int second = time % 60;
			System.out.println(hour + "�ð�" + minute + "��" + second + "��");
		}
}
