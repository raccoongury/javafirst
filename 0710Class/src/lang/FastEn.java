package lang;

public class FastEn {

	public static void main(String[] args) {
		String [ ] station = {"광화문", "종로3가", "을지로4가"};
		for(int i =0; i<station.length;i=i+1) {
			System.out.println(station[i]);
		}
		for(String temp:station) {
			System.out.println(temp);
		}

	}

}
