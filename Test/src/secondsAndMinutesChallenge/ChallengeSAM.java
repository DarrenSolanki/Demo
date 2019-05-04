package secondsAndMinutesChallenge;

import java.math.RoundingMode;

public class ChallengeSAM {
	
	private static final String INVALID_VALUE_MESAGE = "Invalid value";
	public static void main(String[] args) {
		String time = getDurationString(61, 66);
		System.out.println(time);
		time = getDurationString(3945);
		System.out.println(time);
		 
	}
	
	public static String getDurationString(double min, double sec) {
		
		if(min>=0 && (sec <= 59 || sec >=0))
		{
			double s = (min*60)+sec;
			int hour = (int) (s/3600);
			int x = (int)(s%3600);
			int minutes = x/60;
			int seconds = x%60;

			String time = "Total time is : "+ hour+"h "+minutes+"m "+seconds+"s ";
			return time;
		}
		else {
			return INVALID_VALUE_MESAGE;
		}
	}
	public static String getDurationString(double sec) {
		if(sec>=0) {
			int minutes = (int) (sec/60);
			int seconds = (int) (sec%60);
			return getDurationString(minutes, seconds);
		}
		else {
			return INVALID_VALUE_MESAGE;
		}
	
	
	}

}
