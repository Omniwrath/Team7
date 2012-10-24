public class Sound {

	String birdName;
	String birdSoundLocation;

	public Sound(String birdName, String birdSoundLocation) {
		super();
		this.birdName = birdName;
		this.birdSoundLocation = birdSoundLocation;
	}

	public String getBirdName() {
		return birdName;
	}

	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}

	public String getBirdSoundLocation() {
		return birdSoundLocation;
	}

	public void setBirdSoundLocation(String birdSoundLocation) {
		this.birdSoundLocation = birdSoundLocation;
	}

}
