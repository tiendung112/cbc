package product;

import java.util.Scanner;

public class Product {
	private String proId;
	private String proName;
	private String producer;
	private long yearMaking;
	private double price ;
	
	public Product() {
		
	}
	public Product(String proId, String proName , String producer , long yearMaking , double price ) {
		this.proId = proId;
		this.proName = proName;
		this.producer = producer;
		this.yearMaking = yearMaking;
		this.price = price;
	}	
	public String getProId() {
		return proId;
	}
	public void setproId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setproName(String proName) {
		this.proName = proName;
	}
	public String getProducer() {
		return producer;
	}
	public void setproducer(String producer) {
		this.producer = producer;
	}
	public long getYearMaking() {
		return yearMaking;
	}
	public void setyearMaking(long yearMaking) {
		this.yearMaking = yearMaking;
	}
	public double getPrice() {
		return price;
	}
	public 	void setprice(double price) {
		this.price = price;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap proId"	);
		proId = sc.nextLine();
		System.out.println("nhap proName");
		proName = sc.nextLine();
		System.out.println("nhap producer");
		producer = sc.nextLine();
		System.out.println("nhap vao yearMaking");
		yearMaking = sc.nextLong();
		System.out.println("nhao vao price");
		price = sc.nextDouble();
	}
	public void display() {
		System.out.println("\tProId = "+ proId);
		System.out.println("\tProName = "+proName);
		System.out.println("\tproducer = "+ producer);
		System.out.println("\tyearMaking = "+ yearMaking);
		System.out.println("\tprice = "+ price);
	}

}
