import org.apache.commons.mail.SimpleEmail;

public class MailSend {

	public static void main(String[] args) {
			try {
				//텍스트 메일을 보낼 수 있는 클래스의 객체 만들기
				SimpleEmail email = new SimpleEmail();
				
				//서버 설정
				email.setAuthentication("ggangpae3", "QKRANSTJR");
				email.setHostName("smtp.naver.com");
				email.setSmtpPort(587);
				//메일 보안 설정 옵션 : 메일이 암화화되서 전송됩니다.
				email.setTLS(true);
				email.setSSL(true);
				email.setFrom("ggangpae3@naver.com", "관리자");
				email.setCharset("utf-8");
				
				//받는 설정
				email.addTo("kevinvoov@naver.com");
				email.setSubject("메일보내기연습");
				email.setMsg("정말로 가나");
				
				//보내기
				email.send();
				System.out.println("메일보내기성공");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

	}

}
