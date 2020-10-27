 /*
 * Andrew Cole
 * T01081920
 * CS 1410
 * Dr Cantrell
 */
/*
* Separate the following file into two class objects
* a driver class and a StringFunctionsClass.
* Then, implement each of the string functions. 
*/

public class StringLab {

	/**
	 * This method should take the string and print it to the screen with a space between each character in the string.
	 * For example, "Hello" should print
	 *    H e l l o
	 * to the screen 
	 * @param s
	 */
	public static void splitTheString(String s)
	{
		String splitString = "";
		for (int i = 0; i < s.length(); i++)
		{
			splitString += s.charAt(i);
			splitString += ' ';
		}
		System.out.println(splitString);
	}
	
	
	/**
	 * This method accepts two strings and returns true if they are the same and false
	 * if they are different
	 */
	public static boolean compareString(String s1, String s2)
	{
	boolean equalStrings = false;
	if(s1.toLowerCase().equals(s2.toLowerCase()));
		equalStrings = true;
	return equalStrings;	
	}
	
    /**
    * This method accepts two strings and returns true if s2 is part of s1.

    */
	public static boolean stringInString(String s1, String s2)
	{
		boolean contains = false;
		
		if(s1.toLowerCase().contains(s2.toLowerCase()));
			contains = true;
		
		return contains;
	}
	
	
	/**
	 * This method should print the following pattern.  Note that there are spaces at the first of the rows
	* If a 3 is given, it should print
	UUUS
	 UUS
	  US
	   S
 
	* If a 5 is given, it should print
		UUUUUS
 		 UUUUS
  		  UUUS
  		   UUS
    	    US
     	     S	
    
	 */
	public static void printSUUPattern(int numOfUs)
	{
		String suuPattern = "";
		int conditionalUs = numOfUs;
		int numSpaces = 0;
		
	while(conditionalUs >= 0)
	{
	    if(numOfUs == 0)
	    {
	        System.out.println("S");
	        break;
	    }
		if (numSpaces > 0)
		{
			for(int j = 0; j < numSpaces; j++)
			{
				suuPattern += ' ';
			}
		}
		
		for (int i = 0; i <= conditionalUs; i++)
		{
			suuPattern += 'U';
		}
		
		conditionalUs -= 1;
		numSpaces++;
		suuPattern += 'S';
		System.out.println(suuPattern);
		suuPattern = "";
		
	}
	}


	/**
	 * Accept as input a String and print all characters in lower case
	 */
	public static void printLower(String s)
	{
		System.out.println(s.toLowerCase());
	}
	
	/**
	* Accept as input a String and replace all 0's with o's and then print the string
	*/
	
	public static String replace0s(String s) //Completed
	{
		String fixedString = "";
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '0')
				fixedString += 'o';
			if (s.charAt(i) != '0')
				fixedString += s.charAt(i);
		}
		return fixedString;
	}

}	

class driver
{
	
	public static void main(String[] args) {
		
		//Split Strings
		System.out.println("Testing Split String");
		splitTheString("JavaIsFun");
		splitTheString("FunWithJava");
		String t = "";
		String [] tmp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int j = 0; j < 25; j++){
			int rand = (int)(Math.random()*tmp.length);
			t = t + tmp[rand];
		}
		splitTheString("Word_" + t);
		
		//Compare Strings
		System.out.println("\nTesting Compare String:");
		String s1 = "cat";
		String s2 = "cat";
		String s3 = new String("cat");
		System.out.println(compareString(s1,s2));//Should print true
		System.out.println(compareString(s1,s3));//Should print true
		
		//strings within strings
		System.out.println("\nTesting Strings Within Strings");
		String s4 = "Concatenate";
		String s5 = "dog";
		System.out.println(stringInString(s4,s3));//Should print true
		System.out.println(stringInString(s4, s5));//Should print true
		
		//print suu pattern
		System.out.println("\nTesting Print SUU Pattern");
		printSUUPattern(0);
		printSUUPattern(1);
		printSUUPattern(2);
		printSUUPattern(3);
		
		//lower case
		System.out.println("\nTesting to Lower Case");
		printLower("CAT");//should print cat
		printLower("dog");//should print dog
		
		//replace0s
		System.out.println("\nTesting Replace 0s");
		System.out.println(replace0s("L00t")); //should print Loot
		System.out.println(replace0s("0000")); //should print oooo
		System.out.println(replace0s("LamaLama")); //should print LamaLama

	}

}
