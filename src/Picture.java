public class Picture {

	String birdName;
	String birdPictureLocation;
	String pictureCredit;

	public Picture(String birdName, String birdPictureLocation, String pictureCredit) {
		super();
		this.birdName = birdName;
		this.birdPictureLocation = birdPictureLocation;
		this.pictureCredit = pictureCredit;
	}

	public String getBirdName() {
		return birdName;
	}

	public void setBirdName(String birdName) {
		this.birdName = birdName;
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
	

}
