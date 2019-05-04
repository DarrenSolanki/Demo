package challengeThreeFive;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		
		 int l = sumFirstAndLastDigit(128);
		 System.out.println(l);
	}
	
	public static int sumFirstAndLastDigit(int number) {
		if(number >=0) {
			if(number>0) {
				int lastdigit = number % 10;
				int length = (int)Math.log10(number);
				int denominator = (int)Math.pow(10, length);
				int firstdigit = number/denominator;
				int sum = lastdigit+firstdigit;
				return sum;
			}
			else {
				return 0;
			}
			
		}
		return -1;
	}

}
