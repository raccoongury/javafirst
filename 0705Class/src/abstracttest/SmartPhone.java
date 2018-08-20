package abstracttest;

//Android와 Iphone 클래스의 인스턴스 주소를 하나의 변수에 저장할 수 있도록
//하기 위해서 작성한 클래스 - 인스턴스를 생성할 필요 없음
//추상 클래스: 인스턴스를 만들 수 없는 클래스
public abstract class SmartPhone {//메소드의 결과형 앞에 abstract를 추가하면 추상 메소드가 됩니다.
	
//추상  메소드: 내용이 없는 메소드로 상속받은 곳에서 반드시 재정의 해야 합니다.
	public abstract void call();//public void call() {}
}
