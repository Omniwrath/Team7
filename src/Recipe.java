public class Recipe {
	String birdRecipe;

	// default constructor, sets recipe to an emptry string
	public Recipe() {
		birdRecipe = "";
	}
	
	public Recipe(String birdName, String birdRecipe) {
		this.birdRecipe = birdRecipe;
	}
	
	// buildRecipe
	// sets data from an array of strings, using location to know where to gather from
	
	public int buildRecipe(String[] data, int location) {
		//birdRecipe = data[location++];
		return location;
	}

	public String getBirdRecipe() {
		return birdRecipe;
	}

	public void setBirdRecipe(String birdRecipe) {
		this.birdRecipe = birdRecipe;
	}

	// toString
	// translates the recipe object into a string
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		return output.toString();
	}
}
