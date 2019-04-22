package mava;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args) 
	{
		int rn= randomNumber();
		System.out.println(rn);

		rn= randomNumber();
		System.out.println(rn);
		
		rn= randomNumber();
		System.out.println(rn);
		
		rn= randomNumber();
		System.out.println(rn);

	}
	
	
	public static int randomNumber() 
	{
		Random rand;
		rand = new Random();
		rand.nextInt();

		int randInt = rand.nextInt(50)+1;
		
//		System.out.println("Random integer ss : " + randInt);
//		System.out.println("Randon integer : "+ rand.nextInt() );
//		System.out.println(rand.nextInt(50)+1);
		return rand.nextInt(50)+1;

	}

}
