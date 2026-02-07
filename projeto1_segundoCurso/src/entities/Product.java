package entities;

public class Product {

	private String name;
	private double price;
	private int quant;
	

	public Product() {
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product(String name, double price, int quant) {
		this.name = name;
		this.price = price;
		this.quant = quant;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}
	
	
	public double totalValueStock() {
		return price * quant;
	}
	
	public void addProduct(int quant) {
		this.quant += quant;
	}
	
	public void setNome(String name) {
		this.name = name;
	}

	public void removeProduct(int quant) {
		this.quant -= quant;
	}
	
	public String toString() {
		return name
				+ ", R$ "
				+ String.format("%.2f", price)
				+ ", "
				+ quant
				+ " unidades"
				+ ", Total R$"
				+ String.format("%.2f", totalValueStock());
	}
}
