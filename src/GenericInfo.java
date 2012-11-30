public class GenericInfo {

	String birdDescription;
	String birdSpecies;
	String birdSnappleFact;
	String birdScientificName;
	String birdSize;

	// default constructor
	public GenericInfo() {
		birdSpecies = "";
		birdScientificName = "";
		birdDescription = "";
		birdSize = "";
		birdSnappleFact = "";
	}
	
	// buildGenericInfo
	// sets data from an array of strings, using location to know where to gather from
	
	public int buildGenericInfo(String[] data, int location) {
		birdScientificName = data[location++];
		birdSnappleFact = data[location++];
		birdSize = data[location++];
		
		
		return location;
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

	// toString
	// returns the GenericInfo in the form of a string
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		//String NEW_LINE = System.getProperty("line.separator");
		
		
		output.append("Scientific Name: " + birdScientificName + "\n");
		output.append("Snapple Fact: " + birdSnappleFact +"\n");
		output.append("Size: " + birdSize +"\n");
				
		return output.toString();
	}



}
