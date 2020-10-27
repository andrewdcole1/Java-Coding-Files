 /*
 * Andrew Cole
 * T01081920
 * CS 1410
 * Dr Cantrell
 */
 
public class Character
{
	private String characterName;
	private double characterHealth;
	private int characterStrength;
	private boolean characterAlive;
	
	public Character (String nameIn, double healthIn, int strengthIn)
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
	
	public double getHealth()
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
	
	public void setHealth (double healthIn)
	{
		characterHealth = healthIn;
	}
	
	public void setStrength (int strengthIn)
	{
		characterStrength = strengthIn;
	}
	
	public double takeDamage(double damageIn)
	{
		characterHealth = (characterHealth - damageIn);
		return characterHealth;
	}
	
	public double dealDamage() throws InterruptedException
	{
		double dealDamage = 0;
		if(characterHealth > 0)
		{
		dealDamage =(Math.random() * (characterStrength - 1 + 1) + 1);
		Thread.sleep(1000);
		System.out.println(characterName + " used 'Slap'! Deals "+ dealDamage + " Damage!");
		}
		return dealDamage;
	}
	
	public boolean isAlive() throws InterruptedException
	{
		boolean isPlayerAlive = true;
		if (characterHealth <= 0)
		{
			Thread.sleep(1000);
			isPlayerAlive = false;
		}
		if (characterHealth > 0)
		{
			Thread.sleep(1000);
			isPlayerAlive = true;
		}
		return isPlayerAlive;
	}
}