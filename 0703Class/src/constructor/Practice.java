package constructor;

public class Practice {
	
	static {
		System.out.println("맨 처음 한번만 수행되는 내용");
	}
	{
		System.out.println("인스턴스(new)를 만들 때 마다 수행되는 내용");
	}
	
	//생성자//2생성자 호출
	public Practice(){
		name = "noname";
	}
	//생성자 오버로딩(위와 동일한 이름의 메소드가 2개 이상 있는 경우)
	public Practice(String arg) {
		name = arg;
		
	}
	
	//이름을 저장하기 위한 인스턴스 변수를 선언
 private String name;//변수 만들어 놓고 
 
//name의 접근자 메소드 시작//source - generate에서 생성
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
////name의 접근자 메소드 끝
		public void display() {
			String name = "지역변수 name";
			//this.을 붙이면 지역변수에서는 찾지 않고 인스턴스 변수에서 찾아옵니다
			System.out.println(this.name);
	}
}

