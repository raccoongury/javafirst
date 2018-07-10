package practice;

public class Problem2 {

	public static void main(String[] args) {
		int cnt = 1;
		for(int i=1; i<=5; i=i+1) {
			if(i<=3) {
				for(int j=1;j<=4-i;j=j+1) {
					System.out.printf("%3d", cnt);
					cnt = cnt + 1;
				}
				
			}
			else {
				for(int j=1;j<=i-2; j=j+1) {
					System.out.printf("%3d", cnt);
					cnt = cnt + 1;
				}
				
			}
			System.out.println("");
		}
	}

}
