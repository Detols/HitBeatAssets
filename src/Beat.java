import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/*
 * Beat
 * Beat(int, int, int)
 * int getY()
 * Beat class is an object that contains information based on individual beats
 * Used to create rectangles and sprites and display them
 */

public class Beat {

	int beatY;
	int beatX;
	int direction;
	/*If direction = 1, beat arrow faces downwards. 
	If direction = 2, beat arrow faces upwards.
	If direction = 3, beat arrow faces right.
	If direction = 4, beat arrow faces left.
	*/
	
	Beat (int locY, int locX, int arrowPoint)
	{
		beatY = locY;
		beatX = locX;
		direction = arrowPoint;
	}
	
	int getY()
	{
		return beatY;
	}
	
}
