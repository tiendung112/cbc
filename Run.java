package run;

import computer.Computer;
import shoe.Shoes;

public class Run {

	public static void main(String[] args) {
		Computer s1,s2;
		Shoes n1,n2;
		
		s1 = new Computer();
		s2 = new Computer();
		n1 = new Shoes();
		n2 = new Shoes();
		
		
		s1.input();
		s2.input();
		n1.input();
		n2.input();
		
		s1.display();
		s2.display();
		n1.display();
		n2.display();
		
	}

}
