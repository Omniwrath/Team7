public class Picture {

	String birdPictureLocation;
	String pictureCredit;

	
	public Picture() {
		birdPictureLocation = "";
		pictureCredit = "";
	}
	
	public Picture(String birdName, String birdPictureLocation, String pictureCredit) {
		this.birdPictureLocation = birdPictureLocation;
		this.pictureCredit = pictureCredit;
	}

	// buildPicture
	// sets data from an array of strings, using location to know where to gather from
	
	public int buildPicture(String[] data, int location) {
		birdPictureLocation = data[location++];
		pictureCredit = data[location++];
		
		return location;
	}

	public String getBirdPictureLocation() {
		return birdPictureLocation;
	}

	public void setBirdPictureLocation(String birdPictureLocation) {
		this.birdPictureLocation = birdPictureLocation;
	}

	public String getPictureCredit() {
		return pictureCredit;
	}

	public void setPictureCredit(String pictureCredit) {
		this.pictureCredit = pictureCredit;
	}
	
	// toString
	// translates the picture object into a string
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		//String NEW_LINE = System.getProperty("line.separator");
		
		
		output.append("Picture Location: " + birdPictureLocation +"\n");
		output.append("Picture Credit:" + pictureCredit + "\n");
				
		return output.toString();
	}

}
