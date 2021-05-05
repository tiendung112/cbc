package shoe;

import java.util.Scanner;

import product.Product;

	public class Shoes extends Product {
		private int size;
		private String color;
	public Shoes() {
		
	}
	public Shoes(int size, String color ,String proId, String proName , String producer , long yearMaking , double price) {
		super(proId , proName , producer , yearMaking,price);
		this.size = size;
		this.color = color;
	}
	public int getsize() {
		return size;
	}
	public void setsize(int size) {
		this.size = size;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color ) {
		this.color = color;
	}
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap size");
		size = scanner.nextInt();
		System.out.println("nhap color");
		color = scanner.nextLine();
		super.input();
	}
	@Override
	public void display() {
		System.out.println("\tsize = "+size);
		System.out.println("\tcolor = " + color);
		super.display();
	}
	
	
}
