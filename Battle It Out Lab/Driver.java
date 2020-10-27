 /*
 * Andrew Cole
 * T01081920
 * CS 1410
 * Dr Cantrell
 */
public class Driver
{
	public static void main(String[] args) throws InterruptedException
	{
			Character character1 = new Character("Billy", 10.0, 5);
			Character character2 = new Character("Christopher", 20.0, 10);
			
			Thread.sleep(1000);
			System.out.println("Here We Have An Intense Matchup Between: \nPlayer One -\nName: " + character1.getName() +"\nHP: " + character1.getHealth() + "\nStrength: " + character1.getStrength());
			Thread.sleep(1000);
			System.out.println("\nPlayer Two -\nName: " + character2.getName() +"\nHP: " + character2.getHealth() + "\nStrength: " + character2.getStrength() + "\n");
			Thread.sleep(1000);
			
			battleMethod(character1, character2);
	}
	
	
	
	public static void battleMethod(Character character1, Character character2) throws InterruptedException
	{
		while(character1.isAlive() == true && character2.isAlive() == true)
		{
			if(character2.isAlive() == true && character1.isAlive() == true)
			{
			Thread.sleep(1000);
			System.out.println(character1.getName() + " Attacks " + character2.getName() + "!\n");
			Thread.sleep(1000);
			character2.takeDamage(character1.dealDamage());
			if(character1.getHealth() > 0)
					System.out.println(character2.getName() + " is still alive! " + simplifiedDecimalMethod(character2.getHealth()) + " HP Remaining!\n");
			character2.isAlive();
			}
			
			if(character2.isAlive() == true && character1.isAlive() == true)
			{
				Thread.sleep(1000);
				System.out.println(character2.getName() + " Attacks " + character1.getName() + "!\n");
				Thread.sleep(1000);
				character1.setHealth(character1.takeDamage(character2.dealDamage()));
				if(character1.getHealth() > 0)
					System.out.println(character1.getName() + " is still alive! " + simplifiedDecimalMethod(character1.getHealth()) + " HP Remaining!\n");
				character1.isAlive();
			}
			
			if(character2.isAlive() == false)
			{
				Thread.sleep(1000);
				System.out.println("The Mighty " + character2.getName() + " has been slain! A valiant effort, but alas it was not enough!\n");
				Thread.sleep(1000);
				System.out.println(character1.getName() + " is the Victor! Congratulations!\n");
			}
			if(character1.isAlive() == false)
			{
				Thread.sleep(1000);
				System.out.println("The Mighty " + character1.getName() + " has been slain! A valiant effort, but alas it was not enough!\n");
				Thread.sleep(1000);
				System.out.println(character2.getName() + " is the Victor! Congratulations!\n *Crowd Roars*");
			}
		}
	}
	
	public static String simplifiedDecimalMethod(double a)
	{
		String decimalValue = Double.toString(a);
		boolean dotFound = false;
		int twoIntegers = 1;
		String twoDecimalInt = "";
		
		for (int i = 0; i < decimalValue.length(); i++)
		{
			if (decimalValue.charAt(i) == '.')
			{
					dotFound = true;
					twoDecimalInt += decimalValue.charAt(i);
					i++;
			}
			if(dotFound == false)
				twoDecimalInt += decimalValue.charAt(i);
			if (dotFound == true && twoIntegers <= 2)
			{
				twoDecimalInt += decimalValue.charAt(i);
				twoIntegers++;
			}
		}
		
		return twoDecimalInt;
	}
}