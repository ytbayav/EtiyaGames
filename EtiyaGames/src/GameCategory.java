import java.util.ArrayList;

public class GameCategory {
	
	private int id;
	private String categoryName;
	private ArrayList<Games> games;
	
	
	public GameCategory() {
		games=new ArrayList<Games>();
	}


	public GameCategory(int id, String categoryName) {
		this();
		this.id = id;
		this.categoryName = categoryName;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public ArrayList<Games> getGames() {
		return games;
	}


	public void setGames(ArrayList<Games> games) {
		this.games = games;
	}


	@Override
	public String toString() {
		return "GameCategory [id=" + id + ", categoryName=" + categoryName + ", games=" + games + "]";
	}
	
	

}