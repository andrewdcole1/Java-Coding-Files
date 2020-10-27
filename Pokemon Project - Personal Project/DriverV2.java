 /*
 * Andrew Cole
 * T01081920
 * CS 1410
 * Dr Cantrell
 */
 
public class Driver
{
	public String[] pokemonList = new String[] {"Pikachu", "Raichu", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle", "Blastoise", "Bulbasaur", "Ivysaur", "Venasaur"); 
	public static void main(String[] args)
	{		
			battleMethod();
	}
	
	public static void battleMethod() throws InterruptedException
	{

		PokemonFinder pokemon1 = new PokemonFinder();
		PokemonFinder pokemon2 = new PokemonFinder();
		
			Thread.sleep(1000);
			System.out.println("Here We Have An Intense Matchup Between: \nPlayer One -\nName: " + pokemon1.getName() +"\nHP: " + pokemon1.getHealth() + "\nStrength: " + pokemon1.getAttack());
			Thread.sleep(1000);
			System.out.println("\nPlayer Two -\nName: " + pokemon2.getName() +"\nHP: " + pokemon2.getHealth() + "\nStrength: " + pokemon2.getAttack() + "\n");
			Thread.sleep(1000);
			
			pokemon1.setOpponentType(pokemon2.getType());
			pokemon2.setOpponentType(pokemon1.getType());
		
		while(pokemon1.isAlive() == true && pokemon2.isAlive() == true) //pokemon 1 attack loop
		{
			if(pokemon2.isAlive() == true && pokemon2.isAlive() == true)
			{
			Thread.sleep(1000);
			System.out.println(pokemon1.getName() + " Attacks " + pokemon2.getName() + "!\n");
			Thread.sleep(1000);
			pokemon2.takeDamage(pokemon1.dealDamage());
			if(character1.getHealth() > 0)
					System.out.println(pokemon2.getName() + " is still alive! " + simplifiedDecimalMethod(pokemon2.getHealth()) + " HP Remaining!\n");
			pokemon2.isAlive();
			}
			
			if(pokemon2.isAlive() == true && pokemon1.isAlive() == true) //pokemon 2 attack loop
			{
				Thread.sleep(1000);
				System.out.println(pokemon2.getName() + " Attacks " + pokemon1.getName() + "!\n");
				Thread.sleep(1000);
				pokemon1.setHealth(pokemon1.takeDamage(pokemon2.dealDamage()));
				if(pokemon1.getHealth() > 0)
					System.out.println(pokemon1.getName() + " is still alive! " + simplifiedDecimalMethod(pokemon1.getHealth()) + " HP Remaining!\n");
				pokemon1.isAlive();
			}
			
			if(pokemon2.isAlive() == false)
			{
				Thread.sleep(1000);
				System.out.println("The Mighty " + pokemon2.getName() + " has been slain! A valiant effort, but alas it was not enough!\n");
				Thread.sleep(1000);
				System.out.println(pokemon1.getName() + " is the Victor! Congratulations!\n");
			}
			if(character1.isAlive() == false)
			{
				Thread.sleep(1000);
				System.out.println("The Mighty " + pokemon1.getName() + " has been slain! A valiant effort, but alas it was not enough!\n");
				Thread.sleep(1000);
				System.out.println(pokemon2.getName() + " is the Victor! Congratulations!\n *Crowd Roars*");
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
}