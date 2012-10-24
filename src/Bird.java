/*
 * 
 */


public class Bird {
	
	String name;
	String picture;
	String description;
	String sound;
	String recipe;
	
	public Bird(String name, String picture, String description, String sound,
			String recipe) {
		super();
		this.name = name;
		this.picture = picture;
		this.description = description;
		this.sound = sound;
		this.recipe = recipe;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String getRecipe() {
		return recipe;
	}
	
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
}
