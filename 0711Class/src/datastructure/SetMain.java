package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {

		//HashSet<String> song = new HashSet<>();//�����
		//TreeSet<String> song = new TreeSet<>();//������
		LinkedHashSet<String> song = new LinkedHashSet<>();//�����
		song.add("BAAM");
		song.add("�帶");
		song.add("���� ��");
		song.add("11:11");
		song.add("BAAM");
		song.add("GEE");
		
		for(String s : song) {
			System.out.println(s);
		}

	}

}
