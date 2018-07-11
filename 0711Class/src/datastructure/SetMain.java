package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {

		//HashSet<String> song = new HashSet<>();//맘대로
		//TreeSet<String> song = new TreeSet<>();//사이즈
		LinkedHashSet<String> song = new LinkedHashSet<>();//저장순
		song.add("BAAM");
		song.add("장마");
		song.add("빨간 맛");
		song.add("11:11");
		song.add("BAAM");
		song.add("GEE");
		
		for(String s : song) {
			System.out.println(s);
		}

	}

}
