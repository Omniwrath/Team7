public class Recipe {
	String birdName;
	String birdRecipe;

	public Recipe(String birdName, String birdRecipe) {
		super();
		this.birdName = birdName;
		this.birdRecipe = birdRecipe;
	}

	public String getBirdName() {
		return birdName;
	}

	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}

	public String getBirdRecipe() {
		return birdRecipe;
	}

	public void setBirdRecipe(String birdRecipe) {
		this.birdRecipe = birdRecipe;
	}

}
