package entities;

public class Product {

	private String name;
	private double price;
	
	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void noStaticUpdate() {
		price = price * 1.1;
	}

	public String toString(){
		return name + " " +price;
	}

}