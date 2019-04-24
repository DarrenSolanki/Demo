package tuesday;

public class Challenge {

	public static void main(String[] args) {
		
		double x = calcFeetAndInchesToCentimeters(-5, 8);
		System.out.println(x);
		double y = calcFeetAndInchesToCentimeters(18);
		
		System.out.println(y);
		// TODO Auto-generated method stub

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet , double inches) {
		
		if (feet>0 && inches >= 0 && inches <= 12) {
		  double centimeter = (feet * 30.48) + (inches * 2.54);
		  return centimeter;
		}
		System.out.println("Invalid");
		return -1.0;
	}
	
    public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if (inches >= 0) {
		  double feet = (inches/12);
		  return feet;
		}
		return -1.0;
	}

}
/// 1feet =.0328cm
/// 