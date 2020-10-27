 /*
 * Andrew Cole
 * T01081920
 * CS 1410
 * Dr Cantrell
 */
public class BattleItOut 
{
	private String characterName;
	private int characterHealth;
	private int characterStrength;
	private boolean characterAlive;
	
	public character (String nameIn, int healthIn, int strengthIn)
	{
		if (healthIn > 99)
			healthIn = 99;
		if (strengthIn > 10)
			strengthIn = 10;
		if (healthIn < 0)
			healthIn = 1;
		
		characterName = nameIn;
		characterHealth = healthIn;
		characterStrength = strengthIn;
	}
	
	public String getName()
	{
		return characterName;
	}
	
	public int getHealth()
	{
		return characterHealth;
	}
	
	public int getStrength()
	{
		return characterStrength;
	}
	
	public void setName (String nameIn)
	{
		characterName = nameIn;
	}
	
	public void setHealth (int healthIn)
	{
		characterHealth = healthIn;
	}
	
	public void setStrength (int strengthIn)
	{
		characterStrength = strengthIn;
	}
	
	public int takeDamage(int damageIn)
	{
		characterHealth = (characterHealth - damageIn);
		return characterHealth;
	}
	
	public int dealDamage()
	{
		int dealDamage = (int)(Math.random() * (characterStrength - 1 + 1) + 1);
		return dealDamage;
	}
}