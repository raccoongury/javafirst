package vo;

public class Buy {
	protected int num;
	protected String usertid;
	protected String productname;
	protected String groupname;
	protected int price;
	protected int amount;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUsertid() {
		return usertid;
	}
	public void setUsertid(String usertid) {
		this.usertid = usertid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Buy [num=" + num + ", usertid=" + usertid + ", productname=" + productname + ", groupname=" + groupname
				+ ", price=" + price + ", amount=" + amount + "]";
	}

}
