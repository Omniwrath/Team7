public class Bird {

	String name;
	String picture;
	String description;
	String sound;
	String recipe;
	String snappleFacts;

	public Bird(String name, String picture, String description, String sound,
			String recipe, String snappleFacts) {
		super();
		this.name = name;
		this.picture = picture;
		this.description = description;
		this.sound = sound;
		this.recipe = recipe;
		this.snappleFacts = snappleFacts;
	}

	public String getSnappleFacts() {
		return snappleFacts;
	}

	public void setSnappleFacts(String snappleFacts) {
		this.snappleFacts = snappleFacts;
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
