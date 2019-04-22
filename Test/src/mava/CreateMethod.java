package mava;

public class CreateMethod {

	public static void main(String[] args) {
		
		 boolean gameover = true;
		 int score = 800;
		 int levelCompleted = 5;
		 int bonus= 100;
		
		calculateScore(true, 800, levelCompleted, bonus);
		calculateScore(false, 10000, 8, 200);

		// TODO Auto-generated method stub

	}
	
	public static int calculateScore(boolean gameover, int score, int levelCompleted, int bonus) {
		 
		 if(gameover) {
			 int finalscore= score + (levelCompleted * bonus);
			 System.out.println("Final score: "+finalscore);
			 return finalscore;
		 }
		 else {
			 return -1; //-1 represents error
		 }
	}

}
