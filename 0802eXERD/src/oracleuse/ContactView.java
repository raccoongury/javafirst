package oracleuse;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ContactView extends JFrame {
	// 필요한 UI 변수 선언

	// 레이블 선언
	JLabel lblName, lblPhone, lblEmail, lblBirthday;
	// 입력받을 텍스트 필드 선언
	JTextField tfName, tfPhone, tfEmail, tfBirthday;
	// 버튼 변수
	JButton btnFirst, btnLast, btnPrev, btnNext;
	JButton btnInsert, btnUpdate, btnDelete, btnSearch, btnClear;

	// 현재 출력 중인 데이터의 인덱스를 표시할 레이블
	JLabel lblIndex;

	// 데이터베이스 작업을 위한 Dao 변수
	ContactDao dao = new ContactDaoImpl();
	// 데이터베이스에서 가져온 결과를 저장하기 위한 List
	List<Contact> list;
	// 현재 출력 중인 데이터의 인덱스를 저장할 변수
	int idx;

	// idx 번째 데이터를 화면에 출력해주는 메소드
	// 맨 처음 한번 호출하고 데이터에 작업이 발생하면 호출하는 메소드
	private void printData() {
		// 읽을 데이터가 없다면 메시지 박스를 출력하고 return
		if (list.size() == 0) {
			JOptionPane.showMessageDialog(null, "읽을 데이터가 없습니다.", "데이터 없음", JOptionPane.ERROR_MESSAGE);
			return;
		}
		// List에서 idx 번째 데이터를 가져옵니다.
		Contact contact = list.get(idx);
		tfName.setText(contact.getName());
		tfPhone.setText(contact.getPhone());
		tfEmail.setText(contact.getEmail());
		// 생일은 Data 타입이므로 toString을 호출해서 String으로 변환해서
		// 출력합니다.
		tfBirthday.setText(contact.getBirthday().toString());
		// 레이블에 현재 인덱스를 출력
		// lblIndaex.setText(String.fromat("%d", idx+1));
		lblIndex.setText((idx + 1) + "");
	}

	// 생성자
	// 객체를 만들 때 초기화를 위해서 생성
	public ContactView() {
		// 중앙에 배치할 패널 생성
		JPanel centerPanel = new JPanel();

		// 레이블을 생성
		lblName = new JLabel("이름", JLabel.RIGHT);
		lblPhone = new JLabel("전화번호", JLabel.RIGHT);
		lblEmail = new JLabel("이메일", JLabel.RIGHT);
		lblBirthday = new JLabel("생년월일", JLabel.RIGHT);

		// 텍스트 필드 생성
		tfName = new JTextField();
		tfPhone = new JTextField();
		tfEmail = new JTextField();
		tfBirthday = new JTextField();

		// 화면에 배치
		centerPanel.setLayout(new GridLayout(4, 2, 3, 3));
		centerPanel.add(lblName);
		centerPanel.add(tfName);

		centerPanel.add(lblPhone);
		centerPanel.add(tfPhone);

		centerPanel.add(lblEmail);
		centerPanel.add(tfEmail);

		centerPanel.add(lblBirthday);
		centerPanel.add(tfBirthday);

		// 페널에 올리기
		add("Center", centerPanel);

		// 코드가 너무 길면 안좋으니 코드를 잘라서 밖에다가 메소드를 만들고 메소드를 호출
		display();

		// 데이터베이스에서 데이터를 가져옵니다.
		list = dao.allContact();
		printData();

		setBounds(100, 100, 800, 700);
		setTitle("연락처");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	private void display() {
		
		//버튼 생성
		btnFirst = new JButton("처음으로");
		btnPrev = new JButton("이전으로");
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(idx == 0) {
					JOptionPane.showMessageDialog(null, "첫번째 데이터 입니다.", "조회에러",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				idx = idx -1;
				printData();
			}
		});
		btnNext = new JButton("다음으로");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				idx = idx +1;
				if(idx == list.size()) {
					idx = 0;
				}
				printData();
			}
		});
		btnLast = new JButton("마지막으로");
		btnLast.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		btnInsert = new JButton("삽입");
		
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//lblIndex의 텍스트가 삽입이 아니면 메시지 박스를
				//출력하고 함수의 수행을 종료
				//문자열의 동일성 여부는 == 가 아니고 equals로 해야 합니다.
				
				if(lblIndex.getText().equals("삽입") == false) {
					JOptionPane.showMessageDialog(null,  "지우고 쓰세요", "삽입에러",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				//입력한 데이터를 가져오기
				String name = tfName.getText();
				String phone = tfPhone.getText();
				String email = tfEmail.getText();
				String birthday = tfBirthday.getText();
				
				//name은 필수 입력이고 3자 이상 입력했는지 검사
				if(name.trim().length() < 3) {
					JOptionPane.showMessageDialog(null,  "이름은 3자 이상", "이름오류", 
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				//phone은 전부 숫자이고 11자리인지 검사
				if(phone.trim().length() != 11) {
					JOptionPane.showMessageDialog(null, "전화번호는 11자리", "전화번호 오류",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				int i = 0;
				while(i<phone.trim().length()) {
					char ch = phone.trim().charAt(i);
					if(ch < '0' || ch > '9') {
						JOptionPane.showMessageDialog(null, "전화번호는 숫자만", "전화번호 오류" ,
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					i = i +1;
				}
				//Dao의 메소드에 맞게 데이터를 생성
				Contact contact = new Contact();
				contact.setName(name);
				contact.setEmail(email);
				contact.setPhone(phone);
				//birthday가 yyymmdd 형식으로 입력되었다고 가정하고
				//Date 타입으로 변경하기
				System.out.println(birthday);
				int year = Integer.parseInt(birthday.substring(0, 4));
				System.out.println(birthday.substring(0,4));
				System.out.println(birthday.substring(4,6));
				System.out.println(birthday.substring(6));
				int month = Integer.parseInt(birthday.substring(4, 6));
				
		int day = Integer.parseInt(birthday.substring(6));
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH,  month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		Date date = new Date(cal.getTimeInMillis());
		contact.setBirthday(date);
		
		dao.insertContact(contact);
		
		list = dao.allContact();
		idx = list.size() - 1;
		printData();
		//대화상자 출력하기
		JOptionPane.showMessageDialog(null,  "삽입성공", "데이터 삽입", 
				JOptionPane.INFORMATION_MESSAGE);
			
		}
		});
		
		
		btnUpdate= new JButton("수정");

		btnUpdate.addActionListener(new ActionListener() {

	@Override
			public void actionPerformed(ActionEvent e) {
			String name = tfName.getText();
			String phone = tfPhone.getText();
			String email = tfEmail.getText();
			String birthday = tfBirthday.getText();
				
			//name의 데이터가 비어있으면 메시지 박스 출력하고 리턴하기
			if(name.trim().length() < 1) {
				JOptionPane.showMessageDialog(null, "이름은 필수 입력입니다." ,
						"입력오류", JOptionPane.ERROR_MESSAGE);
				return;
			}
			//phone의 데이터가 비어 있으면 메시지 박스를 출력하고
			//리턴하고 출력하기
			if(phone.trim().length() <1) {
				JOptionPane.showMessageDialog(null, "전화번호는 필수 입력입니다.",
						"입력 오류", JOptionPane.ERROR_MESSAGE);
				return;
			}
			//날짜 데이터가 년도 4자리-월2자리-일 두자리 형식인지 조사
			int i = 0;
			if(birthday.length() !=10) {
				JOptionPane.showMessageDialog(null, "생일은 10자리로 만들어주세요",
						"입력오류", JOptionPane.ERROR_MESSAGE);
				return;
			}
			while(i<birthday.length()) {
				char ch = birthday.charAt(i);
				//첫번째부터 네번째까지 숫자가 아니면 반복문 종료
				
				if(i>=0 && i<=3) {
					if(ch < '0' || ch > '9') {
						break;
					}
				}
				if(i == 4 || i == 7) {
					if(ch != '-') {
						break;
					}
				}
				if(i==5) {
					if(ch !='0' && ch != '1') {
						break;
						
					}
				}
				if( i == 6) {
					if (ch < '0' || ch > '9') {
						break;
					}
				}
				i = i + 1;
			}
			//유효성 검사에 실패하면 메시지 박스를 출력하고 리턴
			if(i != birthday.length()) {
				JOptionPane.showMessageDialog(null,  "생일은 YYYY-MM-DD 형식",
						"입력 오류", JOptionPane.ERROR_MESSAGE);
				return;
			}
			Contact contact = new Contact();
			contact.setNum(list.get(idx).getNum());
			contact.setName(name);
			contact.setEmail(email);
			contact.setPhone(phone);
			//yyyy-mm-dd 형식의 문자열을 가지고 Date 만들기
			int year = Integer.parseInt(birthday.substring(0, 4));
					int month = Integer.parseInt(birthday.substring(5,7));
					int day = Integer.parseInt(birthday.substring(8));
					Calendar cal = Calendar.getInstance();
					cal.set(Calendar.YEAR, year);
					cal.set(Calendar.MONTH, month-1);
					cal.set(Calendar.DAY_OF_MONTH, day);
					//Calendar 객체를 이용해서 Date 객체 만들기
					Date date = new Date(cal.getTimeInMillis());
					contact.setBirthday(date);
					
					dao.updateContact(contact);
					JOptionPane.showMessageDialog(null, "수정성공",
							"데이터 수정", JOptionPane.INFORMATION_MESSAGE);
					list = dao.allContact();
					printData();
	
			}
		});
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int r=	JOptionPane.showConfirmDialog(null,
						"정말로 삭제?", "삭제",
						JOptionPane.YES_NO_OPTION);
				System.out.println(r);
				if(r == 0) {
					JOptionPane.showMessageDialog(null,  "삭제성공", "삭제",
							JOptionPane.ERROR_MESSAGE);
					dao.deleteContact(list.get(idx).getNum());
					list = dao.allContact();
					idx = 0;
					printData();
				}
				
			}
		});
		
		btnSearch= new JButton("조회");
		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(
						null, "조회할 이름의 일부분을 입력하세요!",
						"이름으로 조회", JOptionPane.QUESTION_MESSAGE);
				tfName.setText("");
				tfPhone.setText("");
				tfEmail.setText("");
				tfBirthday.setText("");
				if(name != null) {
					list = dao.nameContact(name.trim().toUpperCase());
					idx = 0;
					printData();
					
				}
			}
		});
		
		
		
		btnClear = new JButton("지움");

		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 필드들의 텍스트를 전부 삭제
				
				//lblIndex의 타이틀을 삽입으로 변경
				tfName.setText("");
				tfEmail.setText("");
				tfPhone.setText("");
				tfBirthday.setText("");
				//lblIndex의 타이틀을 삽입으로 변경
				lblIndex.setText("삽입");
				
			}
		});
		
		lblIndex = new JLabel("인덱스", JLabel.CENTER);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,  5, 7, 7));
		panel1.setBorder(new TitledBorder("조회"));
		panel1.add(btnFirst);
		panel1.add(btnPrev);
		panel1.add(lblIndex);
		panel1.add(btnNext);
		panel1.add(btnLast);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,  5, 7, 7));
		panel2.setBorder(new TitledBorder("작업"));
		panel2.add(btnInsert);
		panel2.add(btnUpdate);
		panel2.add(btnDelete);
		panel2.add(btnSearch);
		panel2.add(btnClear);
		
		JPanel p = new JPanel(new BorderLayout());
		p.add("Center", panel1);
		p.add("South", panel2);
		
		add("South", p);
	}
}
