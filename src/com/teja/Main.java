package com.teja;
import java.io.*;
import java.util.Scanner;
public class Main {
	static int option;
	static double area;
	static int automate;
	private static Scanner in;
	private static PrintStream ps;
	private static Construction construct;
	public static void main(String args[]) {
		in = new Scanner(System.in);
		ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		ps.println("Construction cost per square feet is\n1."
				+ " 1200INR for standard materials\n"
				+ "2. 1500INR for above standard materials\n"
				+ "3. 1800INR for high standard material\n"
				);
		ps.print("Your choice please: ");
		option = in.nextInt();
		//in.nextLine();
		ps.print("Total area of the house (in square feets) : ");
		area=in.nextDouble();
		//in.nextLine();
		automate = 2;
		if(option == 3) {
			ps.print("2500INR for high standard maternal and fully automated home\r\n");
			ps.print("Do you want fully automated home:\n1. Yes\n2.No\n");
			automate=in.nextInt();
		}
		
		//in.nextLine();
		construct = new Construction(option,area,automate);
		ps.println("The cost of makinh home is : " + construct.getCost());
	}
}
