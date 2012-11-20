public class Sound {

	String birdSoundLocation;

	
	public Sound() {
		birdSoundLocation = "";
	}
	
	public Sound(String birdName, String birdSoundLocation) {
	
		this.birdSoundLocation = birdSoundLocation;
	}
	
	public int buildSound(String[] data, int location) {
		birdSoundLocation = data[location++];
		return location;
	}

	public String getBirdSoundLocation() {
		return birdSoundLocation;
	}

	public void setBirdSoundLocation(String birdSoundLocation) {
		this.birdSoundLocation = birdSoundLocation;
	}

}
