package sharedata;

public class Map {
	private double latitude;
	private double longitude;
	
	//�Ű������� ���� ������ - default constructor
	public Map() {
		super();
	}
	
	//�Ű������� �ִ� ������
	public Map(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

//������ �޼ҵ� - getter & setter
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	//������ ����ϴ� �޼ҵ�
	public void showMap() {
		System.out.println("����:" + latitude + " �浵:" + longitude
				+ "��ġ�� ������ ����մϴ�.");
	}
}
