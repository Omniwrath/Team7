import javax.sound.sampled.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.LineEvent.Type;

public class Sound {

	String birdSoundLocation;

	public Sound() {
		birdSoundLocation = "";
	}

	public Sound(String birdName, String birdSoundLocation) {
		this.birdSoundLocation = birdSoundLocation;
	}

	// buildSound
	// sets data from an array of strings, using location to know where to
	// gather from
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

	// playClip method for sound taken from stack overflow
	// http://stackoverflow.com/questions/577724/trouble-playing-wav-in-java/577926#577926

	// create clip from location
	public void createClip(String soundLocation) {

		// remove the extra carriaage return or new lines to have the path match
		// hard coded file==> "duck.wave" vs "duck.wave/r"
		//prints out same, but b/c of carriage return /r will not play
		String clip = soundLocation.replaceAll("[\n\r]", "");
		//System.out.println(clip);
		//System.out.println("Testing Sound before creatClip method"); // works
																		// through
																		// here
		File clipFile = new File(clip);
		try {
			playClip(clipFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// play clip created
	private static void playClip(File clipFile) throws IOException,
			UnsupportedAudioFileException, LineUnavailableException,
			InterruptedException {
		class AudioListener implements LineListener {
			private boolean done = false;

			@Override
			public synchronized void update(LineEvent event) {
				Type eventType = event.getType();
				if (eventType == Type.STOP || eventType == Type.CLOSE) {
					done = true;
					notifyAll();
				}
			}

			public synchronized void waitUntilDone()
					throws InterruptedException {
				while (!done) {
					wait();
				}
			}
		}

		AudioListener listener = new AudioListener();
		//System.out.println("Testing Sound in playClip method");// works here;
																// fails below
		AudioInputStream audioInputStream = AudioSystem
				.getAudioInputStream(clipFile);
		//System.out.println("Testing Sound in playClip method");// not printing --OK now
		try {
			Clip clip = AudioSystem.getClip();
			clip.addLineListener(listener);
			clip.open(audioInputStream);
			try {
				clip.start();
				listener.waitUntilDone();
			} finally {
				clip.close();
			}
		} finally {
			audioInputStream.close();
		}
	}

	// toString
	// translates the Sound object into a string

	public String toString() {
		StringBuilder output = new StringBuilder();
		//String NEW_LINE = System.getProperty("line.separator");

		output.append("Sound Location: " + birdSoundLocation +"\n");
		return output.toString();

	}
}
