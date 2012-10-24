public class GenericInfo {

	String birdDescription;
	String birdSpecies;
	String birdGenus;

	public GenericInfo(String birdDescription, String birdSpecies,
			String birdGenus) {
		super();
		this.birdDescription = birdDescription;
		this.birdSpecies = birdSpecies;
		this.birdGenus = birdGenus;
	}

	public String getBirdDescription() {
		return birdDescription;
	}

	public void setBirdDescription(String birdDescription) {
		this.birdDescription = birdDescription;
	}

	public String getBirdSpecies() {
		return birdSpecies;
	}

	public void setBirdSpecies(String birdSpecies) {
		this.birdSpecies = birdSpecies;
	}

	public String getBirdGenus() {
		return birdGenus;
	}

	public void setBirdGenus(String birdGenus) {
		this.birdGenus = birdGenus;
	}

}
