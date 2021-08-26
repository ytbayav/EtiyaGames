
public class Main {

	public static void main(String[] args) {
		
		
		GameService gameService = new GameService();
		for(Games game : gameService.getGames()) {
			System.out.println(game.gameName);
			System.out.println(game.gameGenre);
			System.out.println(game.gamePrice);
			System.out.println("-------------");
		}
		
	UserService userService = new UserService();
		for(User user : userService.getUser()) {
			System.out.println(user.firstName);
			System.out.println(user.lastName);
			System.out.println(user.age);
			userService.addUser(user);
			System.out.println("-------------");
		}
		
		GameCategoryService gameCategoryService=new GameCategoryService();
		
		for(GameCategory gameCategory:gameCategoryService.getAllCategory())
		{
			System.out.println(gameCategory);
		}
		
	}

}
