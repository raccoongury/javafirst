package sharedata;

//��ġ ������ �������� Ŭ����
public class Location {
	public double latitude;
	public double longitude;
	
	public void getLocation() {
		//�����ڸ� �̿��� ������ ����
		//Map map = new Map(latitude, longitude);
		
		//setter�� �̿��� ������ ����
		Map map = new Map();
		map.setLatitude(latitude);
		map.setLongitude(longitude);
		
		map.showMap();
	}
}



