package com.krao.example1;

public class ShoppingCart implements Comparable<ShoppingCart> {

	private String itemName;
	private int quantity;
	private int price;

	public ShoppingCart(String itemName, int quantity, int price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoppingCart [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public int compareTo(ShoppingCart sc1) {

		if(this.price > sc1.price) 
			return 1;
		else if(this.price < sc1.price)
			return -1;
		else 
			return 0;
	}

}
