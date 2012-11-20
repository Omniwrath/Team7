public class Recipe {
	String birdRecipe;

	// default constructor, sets recipe to an emptry string
	public Recipe() {
		birdRecipe = "";
	}
	
	public Recipe(String birdName, String birdRecipe) {
		this.birdRecipe = birdRecipe;
	}
	
	
	
	public int buildRecipe(String[] data, int location) {
		birdRecipe = data[location++];
		return location;
	}

	public String getBirdRecipe() {
		return birdRecipe;
	}

	public void setBirdRecipe(String birdRecipe) {
		this.birdRecipe = birdRecipe;
	}

}
