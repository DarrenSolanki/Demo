package mava;

public class Main {

	public static void main(String[] args) {
	
		int myVariable = 50;
		
		if(myVariable==50)
			{
			System.out.println("printed");
			}
		else
			{
			System.out.println("Not printed");
			}
		System.out.println(++myVariable); 
		System.out.println(--myVariable);
		System.out.println("This is a test");
		System.out.println("This is still more");
		
		int anotherVariable = 50; myVariable--; System.out.println("This is another one");
		
	}

}
