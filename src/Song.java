import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.backends.lwjgl.audio.Mp3.Music;

/*
 * Song
 * Song (int, Music)
 * int length()
 * int beatType()
 * Beat whichBeat()
 * void addBeat(Beat)
 * void addYCoord(String)
 * void submitYCoords()
 * Music getMusic()
 * Song is an object that holds an arraylist of beats and strings that instruct the constructor in the game screen to create sprites and rectangles
 * Basically the backbone of the program that lets the game be played
 */

public class Song {

	ArrayList <Beat> songSheet = new ArrayList<Beat>();
	ArrayList<String> yCoords = new ArrayList<String>();
	Music music;
	int songID;
	
	Song (int value, Music audio)
	{
		music = audio;
		songID = value;
	}
	
	int length()
	{
		return songSheet.size();
	}
	
	int beatType(int i)
	{
		Beat beat = songSheet.get(i);
		return beat.direction;
	}
	
	Beat whichBeat(int i)
	{
		Beat beat = songSheet.get(i);
		return beat;
	}
	
	void addBeat(Beat beat)
	{
		songSheet.add(beat);
	}

	void addYCoord(String i)
	{
		yCoords.add(i);
	}
	
	void submitYCoords()
	{
		for (int i = 0; i < songSheet.size(); i++)
		{
			int locY = Integer.parseInt(yCoords.get(i));
			songSheet.get(i).beatY = locY;
		}
	}

	public Music getMusic() {
		// TODO Auto-generated method stub
		return music;
	}
}
