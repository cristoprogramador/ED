package shopping;

import java.util.*;

public class ShoopingCart {

	private ArrayList<Product> items;

	public ShoopingCart(ArrayList<Product> sh) {
		items = sh;
	}

	public Product getItem(int i) {
		Product prod = (Product) items.get(i);
		return prod;
	}

	public void setItems(ArrayList<Product> items) {
		this.items = items;
	}
	
	/**
	 * 
	 * @return devuelve un Double el sumatorio de los precios de los productos
	 */
	public Double getBalance() {
		Double balance = 0.0;
		for (Product p : items) {
			balance += p.getPrice();
		}
		return balance;
	}

	/*
	 * public double getBalance() { double balance = 0.00; for (Iterator i =
	 * items.iterator(); i.hasNext();) { Product item = (Product)i.next(); balance
	 * += item.getPrice(); }
	 * 
	 * return balance; }
	 */
	public Boolean addItem(Product item) {
		return items.add(item);
	}

	public void removeItem(Product item) {
		items.remove(item);
	}

	public int getItemCount() {
		return items.size();
	}

	public void empty() {
		items.clear();
	}
}
