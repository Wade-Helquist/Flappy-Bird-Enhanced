
/**
*	Music - This class loads a sound (.wav) and plays it.
*
* @Author William Fiset, Micah Stairs
* March 13, 2014
**/

import javax.sound.sampled.*;

public abstract class Music{

	/** Loads a sound clip and plays it **/
	public static void playSound(String fileName){

		try{
			AudioInputStream audio = AudioSystem.getAudioInputStream(
					Music.class.getResource("/" + fileName));
			Clip musicClip = AudioSystem.getClip();
			musicClip.open(audio);
			musicClip.start();

		}
		catch(Exception e){
			System.out.println("Might wanna check classpath resource: /" + fileName);
			e.printStackTrace();
		}
		
	}
}















