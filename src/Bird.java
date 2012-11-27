import java.io.*;
import java.util.*;


public class Bird {

	String myCommonName;
	GenericInfo myGenericInfo;
	Picture myPicture;
	
	
	public Bird() {
		myCommonName = "";
		myPicture = null;
		myGenericInfo = null;
	}
	
	// buildBird
	// sets data from an array of strings, using location to know where to gather from
	
	public int buildBird(String[] birdData, int location) throws FileNotFoundException{
		myCommonName = birdData[location++];
		myGenericInfo = new GenericInfo();
		location = myGenericInfo.buildGenericInfo(birdData, location);
		myPicture = new Picture();
		location = myPicture.buildPicture(birdData, location);
		System.out.println(location);
		return location;
	}
	
	// toString
	// returns the bird object in the form of a string
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		
		
		output.append("Common Name: " + myCommonName + NEW_LINE);
		output.append(myGenericInfo.toString());
		output.append(myPicture.toString());
				
		return output.toString();
	}
	
	public Bird getBird(){
		return null;//return null for now-- return for birdwhisperer
	}
	
}
