package lab1;

import java.util.Scanner;


public class Main {

	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		ContainerArray arr = new ContainerArray();
		arr.initArr();
		arr.getObj(15);
		arr.addObj(4);
		arr.addObj(80);
		arr.delobj(3);
		arr.delobj(5);
	}

}
