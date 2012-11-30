import java.io.*;
import java.util.*;


public class Bird {

	String myCommonName;
	GenericInfo myGenericInfo;
	Picture myPicture;
	Sound mySound;
	String soundLocation;
	
	
	public Bird() {
		myCommonName = "";
		myPicture = null;
		myGenericInfo = null;
	}
	
	// buildBird
	// sets data from an array of strings, using location to know where to gather from
	
	public GenericInfo getMyGenericInfo() {
		return myGenericInfo;
	}

	public void setMyGenericInfo(GenericInfo myGenericInfo) {
		this.myGenericInfo = myGenericInfo;
	}

	
	public void getMySound() {
		 mySound.createClip(mySound.getBirdSoundLocation());
	}

	public void setMySound(Sound mySound) {
		this.mySound = mySound;
	}
	public String getMyPicture() {
		return myPicture.getBirdPictureLocation();
	}

	public void setMyPicture(Picture myPicture) {
		this.myPicture = myPicture;
	}

	public int buildBird(String[] birdData, int location) throws FileNotFoundException{
		myCommonName = birdData[location++];

		myGenericInfo = new GenericInfo();
		location = myGenericInfo.buildGenericInfo(birdData, location);
		myPicture = new Picture();
		location = myPicture.buildPicture(birdData, location);
		mySound = new Sound();
		location = mySound.buildSound(birdData,location);
		//System.out.println(mySound.toString());
		
		//System.out.println(location);
		return location;
	}
	
	// toString
	// returns the bird object in the form of a string
	

	public String toString() {
		StringBuilder output = new StringBuilder();
		//String NEW_LINE = System.getProperty("line.separator");
		
		output.append("Common Name: " + myCommonName + "\n");
		output.append(myGenericInfo.toString());
		output.append(myPicture.toString());
		output.append(mySound.toString());
				
		return output.toString();
	}
	
	public Bird getBird(){
		
		return this;//return this Bird
	}
	
}
