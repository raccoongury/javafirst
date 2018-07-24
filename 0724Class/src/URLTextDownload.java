import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class URLTextDownload {

	public static void main(String[] args) {
		try {
			
			//1. 다운로드 받을 주소 만들기
			String addr = "http://sports.news.nate.com/view/20180724n11601";
			//한글이 포함된 경우라면 URLEncoder.encode 메소드를
			//이용해서 한글을 인코딩합니다.
			
			//2. 주소를 가지고 URL 객체를 생성
			URL url = new URL(addr);
			
			//3. URL 연결 객체를 생성합니다.
			HttpURLConnection con = 
				(HttpURLConnection)url.openConnection();
			
			
			//4. 옵션을 설정합니다.
			//연결이 안되면 30초까지 시도
			con.setConnectTimeout(30000);
			//이전에 받은 데이터가 있어도 사용하지 않도록 설정
			con.setUseCaches(false);
			
			//5.다운로드 받을 스트림 생성
			BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
								con.getInputStream(),"EUC-KR") );
			
			//6.데이터를 읽어서 String으로 만들기
			//문자열을 복사하지 않고 편집할 수 있는 클래스의 객체 만들기
			StringBuilder sb = new StringBuilder();
			while(true) {
				//한 줄의 문자열을 읽기
				String line = br.readLine();
				//읽은 게 없으면 읽기 중단
				if(line == null) {
					break;
				}
				//읽은 데이터가 있으면 sb에 추가
				sb.append(line + "\n");
			}
			//읽은 데이터를 String으로 변환
			String html = sb.toString();
			//화면에 출력
			System.out.println(html);
			
			//7.사용한 객체 정리
			br.close();
			con.disconnect();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}





