/*
Types:
0 - Undefined (Null)
1 - Fire
2 - Water
3 - Electric
4 - Grass
*/

public class PokemonFinder
{
	public int playerDefinition = 1;
	private String characterName;
	private double characterHealth;
	private int characterType;
	private int opponentType;
	private int characterAttack;
	
	public pokemon()
	{
		characterHealth = 0.0;
		characterName = "";
		characterType = 0;
		characterAttack = 0;
		opponentType = 0;
		
		String[] pokemonList = new String[] {"Pikachu", "Raichu", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle", "Blastoise", "Bulbasaur", "Ivysaur", "Venasaur");
		characterName = pokemonList[(Math.random() * ((pokemonList.length) - 1 + 1) + 1)];
		
		setPokemonDatabase(); //Set Pokemon
		
	}
	
	public int getType()
	{
			return characterType;
	}
	
	public String getName()
	{
		return characterName;
	}
	
	public double getHealth()
	{
		return characterHealth;
	}
	
	public int getAttack()
	{
		return characterAttack;
	}
	
	public void setName (String nameIn)
	{
		characterName = nameIn;
	}
	
	public void setHealth (double healthIn)
	{
		characterHealth = healthIn;
	}
	
	public void setAttack(int attackIn)
	{
		characterAttack = attackIn;
	}
	
	public void setOpponentType(int typeIn)
	{
		opponentType = typeIn;
	}
	
	public double takeDamage(double damageIn)
	{
		characterHealth = (characterHealth - damageIn);
		return characterHealth;
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
	
	public double dealDamage() throws InterruptedException
	{
		int attackChoice = 0;
		double dealDamage = 0;
		String attackName = " ";
		boolean superEffective = false;
		boolean missedCondition = false:
		boolean criticalCondition = false;
		int accuracy = 0;
		
		criticalChance = Math.random() * (100 - 1 + 1) + 1;
		attackChoice = Math.random() * (4 - 1 + 1) + 1;
		
		if (criticalChance <= 5)
			criticalCondition = true;
		
		if(characterHealth > 0)
		{
		accuracy = (Math.random() * (100 - 1 + 1) + 1); //number between 1 and 100
		//dealDamage = (Math.random() * (characterAttack - 1 + 1) + 1);
		Thread.sleep(1000);
		
		if(characterName.charAt(0) == 'p') //Pikachu
		{
			if (attackChoice == 1)
			{
				attackName = "'Growl'"; //accuracy 100 | damage n/M
				//no need w/ 100% accuracy
				dealDamage = (Math.random() * (characterAttack - 1 + 1) + 1);
			}
			if (attackChoice == 2) 
			{
				attackName = "'Thunder Shock'"; //accuracy 100 | damage 40
				dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);
			}
			if (attackChoice == 3) 
			{
				attackName = "'Tail Whip'"; // 100 | n/M
				dealDamage = (Math.random() * (characterAttack - 1 + 1) + 1);
			}
			if (attackChoice == 4)
			{
				attackName = "'Quick Attack'"; // 100 | 40
				dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);				
			}
			if (opponentType == 2) //if opponent is water type
			{
				superEffective = true;
			}
		}
		if(characterName.charAt(0) == 'r') //Raichu
		{
			if (attackChoice == 1)
			{
				attackName = "'Thunder Punch'"; //100 | 75
				
				dealDamage = (Math.random() * (characterAttack - 75 + 1) + 75);
			}
			if (attackChoice == 2)
			{
				attackName = "'Brick Break'"; //100 | 75
				
				dealDamage = (Math.random() * (characterAttack - 75 + 1) + 75);
			}
			if (attackChoice == 3)
			{
				attackName = "'Discharge'"; //100 | 80
				
				dealDamage = (Math.random() * (characterAttack - 80 + 1) + 80);
			}
			if (attackChoice == 4)
			{
				attackName = "'Slam'"; //75 | 80
				dealDamage = (Math.random() * (characterAttack - 80 + 1) + 80);
				if (accuracy >= 75)
				{
					dealDamage = 0;
					missedCondition = true;
				}
			}
			if (opponentType == 2) //if opponent is water type
			{
				superEffective = true;
			}
		}
		if(characterName.charAt(0) == 'c') //Charmander || Charmeleon || Charizard
		{
			if(characterName == "charmander") //Charmander
			{
				if (attackChoice == 1)
				{
					attackName = "'Scratch'"; //100 | 40
					dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);
				}
				if (attackChoice == 2)
				{
					attackName = "'Fire Fang'"; //85 | 65
					dealDamage = (Math.random() * (characterAttack - 65 + 1) + 65);
					if (accuracy >= 85)
					{
						dealDamage = 0;
						missedCondition = true;
					}
				}
				if (attackChoice == 3)
				{
					attackName = "'Flamethrower'"; //100 | 90
					dealDamage = (Math.random() * (characterAttack - 90 + 1) + 90);
				}
				if (attackChoice == 4)
				{
					attackName = "'Fire Spin'"; //85 | 45 
					dealDamage = (Math.random() * (characterAttack - 45 + 1) + 45);
					if (accuracy >= 85)
					{
						dealDamage = 0;
						missedCondition = true;
					}
				}
				if (opponentType == 4) //if opponent is grass type
				{
					superEffective = true;
				}
			}
			if(characterName == "charmeleon") //Charmeleon
			{
				if (attackChoice == 1)
				{
					attackName = "'Inferno'"; // 50|95
					dealDamage = (Math.random() * (characterAttack - 95 + 1) + 95);
					if (accuracy <= 50)
					{
						dealDamage = 0;
						missedCondition = true;
					}
				}
				if (attackChoice == 2)
				{
					attackName = "'Smokescreen'"; // 100|n/M
					dealDamage = (Math.random() * (characterAttack - 1 + 1) + 1);
				}
				if (attackChoice == 3)
				{
					attackName = "'Dragon Breath'"; //100|60
					dealDamage = (Math.random() * (characterAttack - 60 + 1) + 60);
				}
				if (attackChoice == 4)
				{
					attackName = "'Growl'"; // 100|n/M
					dealDamage = (Math.random() * (characterAttack - 1 + 1) + 1);
				}
				if (opponentType == 4) //if opponent is grass type
				{
					superEffective = true;
				}
			}
			if(characterName == "charizard") //Charizard
			{
				if (attackChoice == 1)
				{
					attackName = "'Air Slash'"; //95|75
					dealDamage = (Math.random() * (characterAttack - 75 + 1) + 75);
					if (accuracy >= 95)
					{
						dealDamage = 0;
						missedCondition = true;
					}
				}
				if (attackChoice == 2)
				{
					attackName = "'Ember'"; //100|40
					dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);
				}
				if (attackChoice == 3)
				{
					attackName = "'Flamethrower'"; //100|90
					dealDamage = (Math.random() * (characterAttack - 90 + 1) + 90);
				}
				if (attackChoice == 4)
				{
					attackName = "'Flare Blitz'"; //100|120
					dealDamage = (Math.random() * (characterAttack - 120 + 1) + 120);
				}
				if (opponentType == 4) //if opponent is grass type
				{
					superEffective = true;
				}
			}			
		}
		if(characterName.charAt(0) == 's') //Squirtle
		{
			if (attackChoice == 1)
			{
				attackName = "'Water Gun'"; // 100 | 40
				dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);
			}
			if (attackChoice == 2)
			{
				attackName = "'Tail Whip'"; // 100 | n/M
				dealDamage = (Math.random() * (characterAttack - 1 + 1) + 1);
			}
			if (attackChoice == 3)
			{
				attackName = "'Bite'"; // 100 | 60
				dealDamage = (Math.random() * (characterAttack - 60 + 1) + 60);
			}
			if (attackChoice == 4)
			{
				attackName = "'Water Pulse'"; // 100 | 60
				dealDamage = (Math.random() * (characterAttack - 60 + 1) + 60);				
			}	
			if (opponentType == 1) //if opponent is fire type
			{
				superEffective = true;
			}
		}
		if(characterName.charAt(0) == 'w') //Wartortle
		{
			if (attackChoice == 1)
			{
				attackName = "'Water Gun'";	//  100|40
				dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);
			}
			if (attackChoice == 2)
			{
				attackName = "'Aqua Tail'"; // 90|90
				dealDamage = (Math.random() * (characterAttack - 90 + 1) + 90);
				if (accuracy >= 90)
				{
					dealDamage = 0;
					missedCondition = true;
				}
			}
			if (attackChoice == 3)
			{
				attackName = "'Hail'"; // 85|75
				dealDamage = (Math.random() * (characterAttack - 75 + 1) + 75);
			if (accuracy >= 85)
			{
				dealDamage = 0;
				missedCondition = true;
			}
			}
			if (attackChoice == 4)
			{
				attackName = "'Brine'"; // 100|65
				dealDamage = (Math.random() * (characterAttack - 65 + 1) + 65);
			}
			if (opponentType == 1) //if opponent is fire type
			{
				superEffective = true;
			}			
		}		
		if(characterName.charAt(0) == 'b') //Bulbasaur || Blastoise
		{
			if(characterName == "bulbasaur") //Bulbasaur
			{
				if (attackChoice == 1)
				{
					attackName = "'Vine Whip'";
				}
				if (attackChoice == 2)
				{
					attackName = "'Leech Seed'";
				}
				if (attackChoice == 3)
				{
					attackName = "'Razor Leaf'";
				}
				if (attackChoice == 4)
				{
					attackName = "'Tackle'";
				}	
				if (opponentType == 2) //if opponent is water type
				{
					superEffective = true;
				}
			}
			if(characterName == "blastoise") //Blastoise
			{
				if (attackChoice == 1)
				{
					attackName = "'Water Gun'"; // 100|40
					dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);
				}
				if (attackChoice == 2)
				{
					attackName = "'Water Pulse'"; // 100|60
					dealDamage = (Math.random() * (characterAttack - 60 + 1) + 60);
				}
				if (attackChoice == 3)
				{
					attackName = "'Rain Dance'"; // 100|n/M
					dealDamage = (Math.random() * (characterAttack - 1 + 1) + 1);
				}
				if (attackChoice == 4)
				{
					attackName = "'Hydro Pump'"; // 80|110
					dealDamage = (Math.random() * (characterAttack - 110 + 1) + 110);
					if (accuracy >= 80)
					{
						dealDamage = 0;
						missedCondition = true;
					}
				}
				if (opponentType == 1) //if opponent is fire type
				{
					superEffective = true;
				}				
			}
		}
		if(characterName.charAt(0) == 'i') //Ivysaur
		{
			if (attackChoice == 1)
			{
				attackName = "'Tackle'"; // 100|40
				dealDamage = (Math.random() * (characterAttack - 40 + 1) + 40);
			}
			if (attackChoice == 2)
			{
				attackName = "'Take Down'"; //90|85
				dealDamage = (Math.random() * (characterAttack - 85 + 1) + 85);
				if (accuracy >= 90)
				{
					dealDamage = 0;
					missedCondition = true;
				}
			}
			if (attackChoice == 3)
			{
				attackName = "'Razor Leaf'"; // 95|55
				dealDamage = (Math.random() * (characterAttack - 55 + 1) + 55);
				if (accuracy >= 95)
				{
					dealDamage = 0;
					missedCondition = true;
				}
			}
			if (attackChoice == 4)
			{
				attackName = "'Poison Powder'"; //75|90
				dealDamage = (Math.random() * (characterAttack - 90 + 1) + 90);
				if (accuracy >= 75)
				{
					dealDamage = 0;
					missedCondition = true;
				}
			}
			if (opponentType == 2) //if opponent is water type
			{
				superEffective = true;
			}			
		}
		if(characterName.charAt(0) == 'v') //Venasaur
		{
			if (attackChoice == 1)
			{
				attackName = "'Solar Beam'"; // 100|120	
				dealDamage = (Math.random() * (characterAttack - 120 + 1) + 120);
			}
			if (attackChoice == 2)
			{
				attackName = "'Double-Edge'"; // 75|120
				dealDamage = (Math.random() * (characterAttack - 120 + 1) + 120);
				if (accuracy >= 75)
				{
					dealDamage = 0;
					missedCondition = true;
				}
			}
			if (attackChoice == 3)
			{
				attackName = "'Vine Whip'"; // 100|45
				dealDamage = (Math.random() * (characterAttack - 45 + 1) + 45);
			}
			if (attackChoice == 4)
			{
				attackName = "'Petal Blizzard'"; //100|90
				dealDamage = (Math.random() * (characterAttack - 90 + 1) + 90);				
				
			}	
			if (opponentType == 2) //if opponent is water type
			{
				superEffective = true;
			}			
		}
		
		if (criticalCondition == true)
		{
			System.out.println("Critical Hit!");
			dealDamage = dealDamage*(1.2);
		}
		if (superEffective == true)
			dealDamage = dealDamage*(1.1);
		if (missedCondition == false && superEffective == true)
			System.out.println(characterName + " used " + attackName + "... Attack Was Super Effective! Deals "+ simplifiedDecimalMethod(dealDamage) + " Damage!");
		if (missedCondition == false && superEffective == false)
			System.out.println(characterName + " used " + attackName + ", Attack Deals "+ simplifiedDecimalMethod(dealDamage) + " Damage!");
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
	
	public setPokemonDatabase void ()
	{
		String pokemonLocator = characterName;
		pokemonLocator = pokemon.toLowerCase();	
		
		if(pokemonLocator.charAt(0) == 'p') //Pikachu
		{
			characterHealth = Math.random() * (200 - 100 + 1) + 100; //number between 200 and 100
			characterAttack = Math.random() * (105 - 100 + 1) + 100; //number between 105 and 100
			characterType = 3; //Electric Type			
		}
		if(pokemonLocator.charAt(0) == 'r') //Raichu
		{
			characterHealth = Math.random() * (220 - 100 + 1) + 100; //number between 220 and 100
			characterAttack = Math.random() * (166 - 100 + 1) + 100;	//number between 166 and 100	
			characterType = 3; //Electric Type			
		}
		if(pokemonLocator.charAt(0) == 'c') //Charmander || Charmeleon || Charizard
		{
			if(pokemonLocator == "charmander") //Charmander
			{
				characterHealth = Math.random() * (282 - 100 + 1) + 100; //number between 282 and 100
				characterAttack = Math.random() * (223 - 100 + 1) + 100; //number between 100 and 223	
				characterType = 1; //Fire Type
			}
			if(pokemonLocator == "charmeleon") //Charmeleon
			{
				characterHealth = Math.random() * (320 - 226 + 1) + 226; //number between 320 and 226
				characterAttack = Math.random() * (249 - 119 + 1) + 119; //number between 249 and 119
				characterType = 1; //Fire Type
			}
			if(pokemonLocator == "charizard") //Charizard
			{
				characterHealth = Math.random() * (360 - 266 + 1) + 266; //number between 360 and 266
				characterAttack = Math.random() * (293 - 155 + 1) + 155; //number between 293 and 155
				characterType = 1; //Fire Type
			}			
		}
		if(pokemonLocator.charAt(0) == 's') //Squirtle
		{
			characterHealth = Math.random() * (292 - 198 + 1) + 198; //number between 292 and 198
			characterAttack = Math.random() * (214 - 100 + 1) + 100; //number between 214 and 100			
			characterType = 2; //Water Type
		}
		if(pokemonLocator.charAt(0) == 'w') //Wartortle
		{
			characterHealth = Math.random() * (322 - 228 + 1) + 228; //number between 322 and 228
			characterAttack = Math.random() * (247 - 117 + 1) + 117; //number between 247 and 117
			characterType = 2; //Water Type			
		}		
		if(pokemonLocator.charAt(0) == 'b') //Bulbasaur || Blastoise
		{
			if(pokemonLocator == "bulbasaur") //Bulbasaur
			{
				characterHealth = Math.random() * (294 - 200 + 1) + 200; //number between 294 and 200
				characterAttack = Math.random() * (216 - 100 + 1) + 100; //number between 216 and 100
				characterType = 4; //Grass Type	
			}
			if(pokemonLocator == "blastoise") //Blastoise
			{
				characterHealth = Math.random() * (362 - 268 + 1) + 268; //number between 362 and 268
				characterAttack = Math.random() * (291 - 153 + 1) + 153; //number between 291 and 153	
				characterType = 2; //Water Type	
			}
		}
		if(pokemonLocator.charAt(0) == 'i') //Ivysaur
		{
			characterHealth = Math.random() * (324 - 230 + 1) + 230; //number between 324 and 230
			characterAttack = Math.random() * (245 - 116 + 1) + 116; //number between 245 and 116
			characterType = 2; //Water Type	
		}
		if(pokemonLocator.charAt(0) == 'v') //Venasaur
		{
			characterHealth = Math.random() * (364 - 270 + 1) + 270; //number between 364 and 270
			characterAttack = Math.random() * (289 - 152 + 1) + 152; //number between 289 and 152
			characterType = 2; //Water Type				
		}
		
		}	
	}
	}
}
	
	
	
	
	
	
	
	
	
}