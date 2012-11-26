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

	
	public String toString() {
		StringBuilder output = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		
		
		output.append("Scientific Name: " + birdScientificName + NEW_LINE);
		output.append("Snapple Fact: " + birdSnappleFact + NEW_LINE);
		output.append("Size: " + birdSize + NEW_LINE);
				
		return output.toString();
	}



}
