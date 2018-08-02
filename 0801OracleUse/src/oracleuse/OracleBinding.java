package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class OracleBinding {

	public static void main(String[] args) {
		//1.������ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �μ���ȣ(����):");
		int deptno = sc.nextInt();
		//System.out.println("�μ���ȣ:" + deptno);
		sc.close();
		
		//2.�Է¹��� �����͸� ������ �����ͺ��̽��� �����ϱ�
		//�ʿ��� ���� ����
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//����̹� Ŭ������ �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("�ε� ����");
			
			//�����ͺ��̽� ����
			con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"scott", "tiger");
			//System.out.println("���� ����");
			
			//SQL ���ఴü ����
			pstmt = con.prepareStatement(
				"delete from dept where deptno = ?");
			pstmt.setInt(1, deptno);
			
			//sql ����
			//�����ϰ� ���� ������� ���� ������ �����մϴ�.
			//���ǿ� �´� �����Ͱ� ������ �����ϴ°� �ƴϰ�
			//�����ϴ� ���� ������ 0�Դϴ�.
			//�����ϸ� ���ܰ� �߻��ϹǷ� catch�� ���ϴ�.
			int r = pstmt.executeUpdate();
			if(r > 0) {
				System.out.println("���� ����");
				//�۾��� �����ϸ� commit�� ȣ��
				con.commit();
			}
			else
				System.out.println("���ǿ� �´� �����Ͱ� �����ϴ�.");
			
		}catch(Exception e) {
			try {
				//�۾����� ���ܰ� �߻��� ��� rollback�� ȣ��
				con.rollback();
			}catch(Exception e1) {}
			//������ ������ ���
			System.out.println(e.getMessage());
			//���ܰ� �߻��� ������ ������
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {}
		}
		

	}
}












