/*
 * Health
 * health(int)
 * int healthCheck()
 * int healthDrop()
 * int healthIncrease()
 * int healthCap()
 * int healthDropped()
 * Health is an object that maintains health ingame and makes changes according to game statements
 */

public class Health {

	int health;	
	int healthDrops;
	
	public Health(int i) 
	{
		health = i;
		if (health != 100)
		{
			healthDrops++;
		}
		if (health < 0)
		{
			health  = 0;
		}
	}

	int healthCheck()
	{
		if (health < 0)
			return 0;
		return health;
	}
	
	int healthDrop()
	{
		return health = health - 10;
	}
	
	int healthIncrease()
	{
		return health++;
	}
	
	int healthCap()
	{
		return 0;
	}
	
	boolean healthDropped()
	{
		if (healthDrops != 0)
			return true;
		return false;
	}
	
}
