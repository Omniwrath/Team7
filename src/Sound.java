public class Sound {

	String birdSoundLocation;

	
	public Sound() {
		birdSoundLocation = "";
	}
	
	public Sound(String birdName, String birdSoundLocation) {
	
		this.birdSoundLocation = birdSoundLocation;
	}
	
	// buildSound
	// sets data from an array of strings, using location to know where to gather from
	public int buildSound(String[] data, int location) {
		//birdSoundLocation = data[location++];
		return location;
	}

	public String getBirdSoundLocation() {
		return birdSoundLocation;
	}

	public void setBirdSoundLocation(String birdSoundLocation) {
		this.birdSoundLocation = birdSoundLocation;
	}
	
	// toString
	// translates the Sound object into a string
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		return output.toString();
	}
}
