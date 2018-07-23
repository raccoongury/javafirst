package io;

import java.io.PrintWriter;

public class PrintwriterMain {

	public static void main(String[] args) {
		// ����, ��Ʈ��ũ, �����ͺ��̽� ���� Ŭ��������
		// ����ó���� �����մϴ�.
		PrintWriter pw = null;
		try {
			// ���� ���丮�� ������ ����
			pw = new PrintWriter("./file.txt");
			pw.print("�ȳ��ϼ��� �ݰ����ϴ�.");
			// �������� ������ ������ ���� ���
			pw.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
