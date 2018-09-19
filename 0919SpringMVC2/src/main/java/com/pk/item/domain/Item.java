package com.pk.item.domain;

public class Item {
	private int itemid;
	private String itmname;
	private int price;
	private String description;
	private String pictureurl;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItmname() {
		return itmname;
	}
	public void setItmname(String itmname) {
		this.itmname = itmname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPictureurl() {
		return pictureurl;
	}
	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itmname=" + itmname + ", price=" + price + ", description=" + description
				+ ", pictureurl=" + pictureurl + "]";
	}

}
