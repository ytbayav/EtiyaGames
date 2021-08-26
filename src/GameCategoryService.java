import java.util.ArrayList;

public class GameCategoryService {
	
	ArrayList <GameCategory> gameCategories=new ArrayList<GameCategory>();
	
	public void add(GameCategory gameCategory)
	{
	   gameCategories.add(gameCategory);
	}
	
	
	public ArrayList <GameCategory> getAllCategory()
	{
		Games game1 = new Games();
		Games game2 = new Games();
		Games game3 = new Games();
		
		ArrayList<Games> games = new ArrayList<Games>();
		games.add(game1);
		games.add(game2);
		games.add(game3);
		
		
		GameCategory gameCategory1=new GameCategory(1,"Strategy");
		gameCategory1.setGames(games);
		
		GameCategory gameCategory2=new GameCategory(2,"Fttp");
		gameCategory2.setGames(games);
		
		GameCategory gameCategory3=new GameCategory(3,"Mobil");
		gameCategory3.setGames(games);
		
		
		gameCategories.add(gameCategory1);
		gameCategories.add(gameCategory2);
		gameCategories.add(gameCategory3);
		
		return this.gameCategories;
		
		
		
	}
	

}