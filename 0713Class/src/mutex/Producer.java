package mutex;

import java.util.ArrayList;

public class Producer extends Thread {
	private ShareData shareData;
	
	//������
	public Producer(ShareData shareData) {
		this.shareData = shareData;
	}
	
	//������� ������ �޼ҵ�
	public void run() {
		for(int i=0; i<26; i=i+1) {
			//65�� i�� ���ؼ� ���ڷ� �������� save �޼ҵ忡�� ����
			shareData.save((char)(65+i));
		}
	}
}
