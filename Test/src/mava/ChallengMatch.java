package mava;

public class ChallengMatch {

	public static void main(String[] args) {
		
		boolean gameover = true;
		int score =10000;
		int levelCompleted=8;
		int bonus = 200;
		
		if(score<10000 && score >5000) {
			System.out.println("Your score is less than 10K but greater than 5K");
			
		}
		else if(score <5000) {
			System.out.println("Your score is less than 5K");
		}
		else {
			System.out.println("Get here");
		}
		
		if (gameover == true){
			int finalscore = score +(levelCompleted*bonus);
			System.out.println("Your final score : "+finalscore);
		}
		
		score =1000;
		levelCompleted=10;
		bonus = 500;
		
		if (gameover == true){
			int finalscore = score +(levelCompleted*bonus);
			System.out.println("Your final score : "+finalscore);
		}
		
		
		// TODO Auto-generated method stub

	}

}
