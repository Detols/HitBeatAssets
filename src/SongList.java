import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.audio.Mp3.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

/*
 * SongList
 * SongList()
 * int length()
 * Song findSong()
 * int randomizeBeatDirection()
 * void createElectroMix()
 * void createSubtleMix()
 * SongList object holds different songs and creates/initializes all songs
 * Methods can be accessed about the songlist
 */

public class SongList {

	ArrayList <Song> songList = new ArrayList<Song>();
	Music electroDynamix = (Music) Gdx.audio.newMusic(Gdx.files.internal("assets/electrodynamix.mp3"));
	Music theoryOfEverything = (Music) Gdx.audio.newMusic(Gdx.files.internal("assets/theoryOfEverything.mp3"));
	Music music3;
	Music music4;
	Music music5;
	Song electroMix;
	Song subtleMix;
	Song number3;
	Song number4;
	Song number5;
	Random random;

	SongList()
	{
		electroMix = new Song (1, electroDynamix);
		subtleMix = new Song(2, theoryOfEverything);
		number3 = new Song(3, music3);
		number4 = new Song(4, music4);
		number5 = new Song(5, music5);
		songList.add(electroMix);
		songList.add(subtleMix);
		songList.add(number3);
		songList.add(number4);
		songList.add(number5);
	}
	
	int length()
	{
		return songList.size();
	}
	
	Song findSong(int songID)
	{
		return songList.get(songID);
	}
	
	int randomizeBeatDirection()
	{
		Random randomgen = new Random();
		int direction = randomgen.nextInt(4);
		return direction;
	}
	
	void createElectroMix()
	{		
		/*
		 * Add randomizer on beat placements
		 */
		
		for (int i = 0; i < 400; i++) //Modify number
		{
			String beat = -500 + i*-100 + "";
			electroMix.addYCoord(beat);
		}
		
		int songLength = electroMix.yCoords.size();
		
		for (int i = 0; i < songLength; i++)
		{
			int direction = randomizeBeatDirection();
			Beat beat = new Beat (0, 0, 0);
			String yCoordString = electroMix.yCoords.get(i);
			int yCoordInt = Integer.parseInt(yCoordString);
			/*
			 * Make an arraylist of y coordinates
			 */
			if (direction == 0)
			{
				beat = new Beat (100, yCoordInt, 1); 
			}
			if (direction == 1)
			{
				beat = new Beat (200, yCoordInt, 2);
			}
			if (direction == 2)
			{
				beat = new Beat (290, yCoordInt, 3);
			}
			if (direction == 3)
			{
				beat = new Beat (0, yCoordInt, 4);
			}
			electroMix.addBeat(beat);
		}
	}
	
	void createSubtleMix()
	{
		for (int i = 0; i < 400; i++)
		{
			String beat = -500 + i*-100 + "";
			subtleMix.addYCoord(beat);
		}
		
		int songLength = subtleMix.yCoords.size();
		
		for (int i = 0; i < songLength; i++)
		{
			int direction = randomizeBeatDirection();
			Beat beat = new Beat (0, 0, 0);
			String yCoordString = subtleMix.yCoords.get(i);
			int yCoordInt = Integer.parseInt(yCoordString);
			/*
			 * Make an arraylist of y coordinates
			 */
			if (direction == 0)
			{
				beat = new Beat (100, yCoordInt, 1); 
			}
			if (direction == 1)
			{
				beat = new Beat (200, yCoordInt, 2);
			}
			if (direction == 2)
			{
				beat = new Beat (290, yCoordInt, 3);
			}
			if (direction == 3)
			{
				beat = new Beat (0, yCoordInt, 4);
			}
			subtleMix.addBeat(beat);
		}
	}
	
}
