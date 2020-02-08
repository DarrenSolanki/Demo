package javaCode;

import java.util.Scanner;

public class AreaOfCuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of cuboid");
		double l = sc.nextDouble();
		
		System.out.println("Enter the width of cuboid");
		double b = sc.nextDouble();
		
		System.out.println("Enter the height of cuboid");
		double h = sc.nextDouble();
		
		lsa(l, b, h);
		tsa(l, b, h);
		diagonalOfCuboid(l, b, h);
	
	}
	
	public static void lsa(double l, double b, double h) {
		
		double area = ((2*(l+b))*h);
		System.out.println("Lateral surface area of cuboid : "+ area);	
	}
	
	public static void tsa(double l, double b, double h) {
		
		double area = (2*((l*b)+(b*h)+(l*h)));
		System.out.println("Total surface area of cuboid : "+ area);	
	}

	public static void diagonalOfCuboid(double l, double b, double h) {
	
		double value = ((l*l)+(b*b)+(h*h));
		double area = Math.sqrt(value) ;
		System.out.println("Length of diagonal : "+ area);	
	}
	

}
