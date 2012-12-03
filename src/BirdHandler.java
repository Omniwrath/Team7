import java.io.*;
import java.util.*;

/**
 * @author Justin Ashburn, Kai Flygare, James Hanks, Oanh Tran, Ahmed Brown, Matthew, Chad Hickenbottom
 *
 */
public class BirdHandler {
	List<Bird> birdCage;	// array to store birds
	Bird currentBird;		// stores the current bird
	int currentLocation;	// stores the location of the current bird in array
	
	// default construct
	// builds bird objects from file
	
	
	public BirdHandler(File input) throws FileNotFoundException {
		
		// make a new list to store the bird objects
		birdCage = new ArrayList<Bird>();

		// initialize nextCh to
		// create empty string to attach file contents onto
		int nextCh;
		StringBuffer strFileContent = new StringBuffer("");
		FileInputStream fin = null;
		// while loop reads in all of input file passed in and attaches it to an
		// empty string;
		// read() returns -1 if end of file
		try {
			fin = new FileInputStream(input);
			while ((nextCh = fin.read()) != -1)
				strFileContent.append((char) nextCh);
			fin.close();
		} catch (Exception e) {
			//System.out.println(e);
		}
		// Create new string from read in file contents
		// Split contents using a comma OR \n (blank line)
		// as delimiter and into an array of strings

		String fileContent = strFileContent.toString();
		String[] splitFileContent = fileContent.split(",|\n");
		
		// initializes birds from string array and then stores them in file
		// temporarily has i+6 because array out of bounds error
		// i increments through buildBird method
		for (int i = 0; i+7 < splitFileContent.length;) {
			Bird temp = new Bird();
			i = temp.buildBird(splitFileContent, i);
			birdCage.add(temp);
		}
		
		// sets currentBird to either first bird in list or null
		if(birdCage.size() > 0) {
			currentBird = birdCage.get(0);
			currentLocation = 0;
		} else {
			currentBird = null;
			currentLocation = -1;
		}
	}
	
	// changeToNextBird()
	// changes current bird to the next bird in array
	// if current bird is last bird in array, sets current bird to first bird in array
	
	public Bird changeToNextBird() {
		if(currentBird == null) { // if no birds in list return null
			return currentBird;
		} else { // otherwise return next bird, or if at end return first bird
			if(currentLocation+1 < birdCage.size()) {
				currentLocation++;
				currentBird = birdCage.get(currentLocation);
			} else {
				currentLocation = 0;
				currentBird = birdCage.get(currentLocation);
			}
			return currentBird;
		}
	}
	
	// changeToPreviousBird()
	// changes current bird to the next bird in array
	// if current bird is last bird in array, sets current bird to first bird in array
	
	public Bird changeToPreviousBird() {
		if(currentBird == null) { // if no birds in list return null
			return currentBird;
		} else { // otherwise return next bird, or if at end return first bird
			if(currentLocation == 0) {
				currentLocation = birdCage.size();
				currentBird = birdCage.get(currentLocation);
			} else {
				currentLocation--;
				currentBird = birdCage.get(currentLocation);
			}
			return currentBird; // returns the new currentBird object
		}
	}
	
    // findBird(String targetName)
    // Uses a recursive binary search to find bird in array. Currently searches
    // by common name.
    // @param targetName: Name of bird to search for
    // @param minIndex: Index to start from (inclusive)
    // @param maxIndex: Index to end at (exclusive)
    // @returns: Bird if targetName found, null if not found

    public Bird findBird(String targetName, int minIndex, int maxIndex) { 
        if (minIndex < maxIndex) {  // Base case, entire array has been searched
            return null;            // Bird has not been found, return null

        } else {                    // Recursive case
            int middleIndex = (maxIndex - minIndex) / 2;
            String name = birdCage.get(middleIndex).myCommonName;
            

            // targetName is at a higher index
            if (name.charAt(0) < targetName.charAt(0) ) {
                return findBird(targetName, middleIndex + 1, maxIndex);

            // targetName is at a smaller index
            } else if (name.charAt(0) > targetName.charAt(0) ) { 
                return findBird(targetName, minIndex, middleIndex - 1);

            // targetName found
            } else { 
                return birdCage.get(middleIndex);
            }
        }
    }


	// toString
	// returns the list of birds in a string

	public String toString() {
		StringBuilder output = new StringBuilder();
		//String NEW_LINE = System.getProperty("line.separator");
		
		for(int i = 0; i < birdCage.size(); i++) {
			output.append(birdCage.get(i).toString());
		}
				
		return output.toString();
		
		
	}
	
	
	
//	/**
//	 * @param args
//	 * main is running program and 
//	 */
//	public static void main(String[] args) {
//		BirdHandler iBird;
//		
//		File input = new File("birdcage.csv");		
//		try {
//			iBird = new BirdHandler(input);
//			//System.out.print(iBird);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}

}
