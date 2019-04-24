package tuesday;

public class Main {

	public static void main(String[] args) {
		int newScore = calculateScore("Rahul", 1000);
		System.out.println("NewScore is : "+ newScore);
		// TODO Auto-generated method stub
		int newscore = calculateScore(100);
		System.out.println(newscore);

	}
	
	public static int calculateScore(String playername, int score) {
		
		System.out.println("Player :"+playername+ " scored "+ score+ " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnammed Player scored : "+ score + " points");
		return score*1000;
	}
	
	public static int calculateScore(int score,int score1, int score2) {
		System.out.println("Unnammed Player scored : "+ score + " points");
		return score*1000;
	}
	
	public static int calculateScore(int score, int score2) {
		System.out.println("Unnammed Player scored : "+ score + " points");
		return score*1000;
	}
}
