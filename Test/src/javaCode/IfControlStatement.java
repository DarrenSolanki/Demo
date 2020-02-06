package javaCode;

import java.util.Scanner;

public class IfControlStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vaue of A");
		int a = sc.nextInt();
		System.out.println("Enter value of B");
		int b = sc.nextInt();
		
		if(a<b){
			System.out.println("A is less than B");
			}
		
		else if(a > b) {
				System.out.println("A is greater than B");
			}
		else if(a == b) {
			System.out.println("A is equal to B");
		}
		System.out.println();
			

	}

}
