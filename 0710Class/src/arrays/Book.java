package arrays;

public class Book implements Comparable{
	//�����ϰ��� �ϴ� �׸�
	private String title;
	private String author;
	private String pubdate;
	private int price;
	
	//������ �޼ҵ�
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//������� ���� �޼ҵ�
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pubdate=" + pubdate + ", price=" + price + "]";
	}
	//ũ��񱳸� �ϴ� �޼ҵ�
	@Override
	public int compareTo(Object o) {
		Book other = (Book)o;

//		if(this.price > other.price) {
//			return 1;
//		}
//		else if(this.price == other.price) {
//			return 0;
//		}
//		else {
//			return -1;
//		}
		return (other.price-this.price);//return this.price - other.price;
	}
}



