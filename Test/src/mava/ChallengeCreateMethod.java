package mava;

public class ChallengeCreateMethod {

	public static void main(String[] args) {
		
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Rahul", position);		

		position = calculateHighScorePosition(900);
		displayHighScorePosition("Danny", position);		

		position = calculateHighScorePosition(400);
		displayHighScorePosition("Gokul", position);		

		position = calculateHighScorePosition(50);
		displayHighScorePosition("Piya", position);
		
		position = calculateHighScorePosition(1000);
		displayHighScorePosition("Rocya", position);
		
		position = calculateHighScorePosition(500);
		displayHighScorePosition("eess", position);
		
		position = calculateHighScorePosition(100);
		displayHighScorePosition("hg", position);

	}
	
	public static void displayHighScorePosition(String name, int position) {

		System.out.println(name+ " managed to get into position "+ position);
	}

	public static int calculateHighScorePosition(int score) {
		
		int position = 4;
		
		if(score >=1000)
		{
			position=1;
		}
		else if(score >=500)
		{
			position=2;
		}
		else if(score >=100)
		{
			position=3;
		}
		
		return position;
		
		 //////////////////// or
		
//		if(score>=1000){
//			return 1;
//		}
//		else if(score>=500){
//			return 2;
//		}
//		else if(score>=100) {
//			return 3;
//		}
//			return 4;
		
	}
}
