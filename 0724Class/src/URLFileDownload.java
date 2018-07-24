import java.io.BufferedInputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLFileDownload {

	public static void main(String[] args) {
		try {
			//다운로드 받을 주소 만들기
			String addr =
					"https://imgnews.pstatic.net/image/001/2018/07/24/PYH2018072415950001300_P2_20180724154708523.jpg?type=w647";
			//addr에서 마지막 / 이후의 문자열을 가져오기
			//마지막/의 위치를 찾습니다.
			int idx = addr.lastIndexOf("/");
			//addr에서 idx+1 번째 글자부터 가져오기
			String filename = addr.substring(idx + 1);
			//System.out.println(filename);
			 
			//filename을 이용해서 저장할 파일 경로 만들기
			String filepath = "C:\\Users\\503-17\\Documents" + filename;
			//파일이 존재하는지 확인
			if((new File(filepath)).exists()) {
				System.out.println("이미 파일이 존재합니다");
			}else {
				System.out.println("파일이 존재 하지 않습니다");
				
				//스레드 객체 생성
				Thread th = new Thread() {
					public void run() {
						try {
							//다운로드 받을 URL 만들기
							URL url = new URL(addr);
							//연결 객체 생성
							HttpURLConnection con = (HttpURLConnection)url.openConnection();
							//옵션 설정
							con.setConnectTimeout(20000);
							con.setUseCaches(false);
							//바이트 단위로 다운로드 받기 위한 스트림 생성
							BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
							//다운로드 받은 내용을 기록할 스트림
							PrintStream ps = new PrintStream(filepath);
							while(true) {
								//512바이트 단위로 데이터 읽기
								byte [] b = new byte[512];
								int r = bis.read(b);
								//읽은 데이터가 없으면 읽기 중단
								if(r <= 0) {
									break;
									
								}
								//읽은 데이터를 ps를 이용해서 기록하기
								ps.write(b, 0, r);
							}
							//전부 기록했으면 정리
							ps.close();
							bis.close();
							con.disconnect();
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
						
		}
	};
	//스레드 시작
	th.start();
}

}catch(Exception e) {
System.out.println(e.getMessage());
}

}

}

