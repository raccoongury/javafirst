package mutex;

import java.util.ArrayList;

public class Customer extends Thread {
			private ShareData shareData;
			public Customer(ShareData shareData) {
				this.shareData = shareData;
			}
			
			//������� ������ ������ ������ �޼ҵ�
			public void run() {
				for(int i = 0; i<26; i=i+1) {
					shareData.get ();
			}
}
}
