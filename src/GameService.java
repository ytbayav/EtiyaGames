
public class GameService {
	
	public Games [] getGames() {
		Games game1 = new Games();
		game1.gameName = "Dota2";
		game1.gameGenre = "Strategy";
		game1.gamePrice = 1000;
		
		Games game2 = new Games ();
		game2.gameName = "CallofDuty";
		game2.gameGenre = "Fttp";
		game2.gamePrice = 5;
		
		Games game3 = new Games();
		game3.gameName = "FlappyBird";
		game3.gameGenre = "Mobil";
		game3.gamePrice = 0;
		
		Games [] games = {game1, game2, game3};
		return games;
	}
	
	
	public void saveGame() {
		System.out.println("Game Saved!");
	}


}
