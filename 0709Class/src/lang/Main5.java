package lang;

public class Main5 {

	public static void main(String[] args) {
		
		for(int i= 1; i<=5; i=i+1){
			for(int j= 1; j<=i; j=j+1){
				System.out.print("*");
			}
			System.out.println(" " );
		}
		
		
		for(int i= 1; i<=5; i=i+1){
			if(i <=3) {
				for(int j=1; j<=i; j=j+1) {
					System.out.print("*");
				}
			}
			else {
				for(int j=1; j<=6-i; j=j+1) {
					System.out.print("*");
				}
			}
			System.out.println(" " );
		}

	}

}
