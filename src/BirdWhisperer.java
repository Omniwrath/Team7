//hi
public class BirdWhisperer {
	
	Bird currentBird;
	BirdHandler program;
	public BirdWhisperer(BirdHandler program){
		
		this.program=program;
		currentBird= program.changeToNextBird().getBird();
		
	}
	
	public Bird getPrev(Bird currentBird) { //Gets the previous bird in the array
//			//Will change name to the binary search
//		index = findBird(currentBird); //Gets index from current bird
//		return birdcage[index - 1]; //Returns the bird in the index before
		return currentBird = program.changeToPreviousBird();
		
	}
	
	public Bird getNext(Bird currentBird) { //Gets next bird in the array
//			//Will change name to the binary search
//		index = findBird(currentBird); //Gets index from the current bird by finding it in the array
//		return birdcage[index + 1]; //Returns the next bird
		return currentBird = program.changeToNextBird();
		
	}


	public Bird getBird() {
		return currentBird;// will return a bird, but return null for now
		//called from the GUI
		
	}

}
