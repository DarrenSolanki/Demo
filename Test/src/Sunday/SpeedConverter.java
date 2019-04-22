package Sunday;

public class SpeedConverter {

	public static void main(String[] args) {
		
		long miles = toMilesPerHour(1.5);
		System.out.println(miles);
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		if(kilometersPerHour < 0){
			return -1;
		}
			long milesPerHour = Math.round(kilometersPerHour/1.609);
			return milesPerHour;
		
	}

}
