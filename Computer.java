package computer;

import java.util.Scanner;

import product.Product;


	public class Computer extends Product{
		private String info;
		private String warrantyYear;
	public Computer() {
	}
	public Computer(String info, String warrantyYear ,String proId, String proName , String producer , long yearMaking , double price) {
		super (proId , proName , producer, yearMaking, price);
		this.info = info;
		this.warrantyYear = warrantyYear;
	}
	public String getinfo() {
		return info;
	}
	public void setinfo(String info) {
		this.info = info;
	}
	public String getWarrantyYear() {
		return warrantyYear;
	}
	public void setwarrantyYear(String warrantyYear) {
		this.warrantyYear = warrantyYear;
	}
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao info");
		info = sc.nextLine();
		super.input();
		System.out.println("nhap vao warrantyYear");
		warrantyYear = sc.nextLine();
	}
	@Override
	public void display() {
		System.out.println("\tinfo "+info);
		System.out.println("\twarrantyYear "+warrantyYear );
		super.display();
	}
	
	
	
	
	
	
	
}