/*
The reason you have to start every main program with main(String [] args) is for command 
line arguments. This creates an array of string objects in an array called args. (You can 
actually call this array other things. You can access this array in your code at any point 
like you would any other array. 
You can convert these strings to int values if needed. For example, if your user types 
in java app 1 2 3 then: 
args[0] = 1
args[1] = 2
args[2] = 3
But that 1, 2, and 3 are stored as strings not ints. To store them as ints we could do
something like. 
int x = Integer.parseInt(args[0]); 
Then x would hold 1 or whatever your user entered. 
*/

import java.security.SecureRandom; 

public class ICEArrays
{
	public static void main(String [] args)
	{
	
	SecureRandom sr = new SecureRandom(); 
	
	//1. check to see the user entered 3 arguments
	
		if (args.length == 2)
		{
		
		//2. Create three new int arrays based on the sizes specified by the user and a 
		//	 third array with the values 111,222,333,444
		
		int [] array1 = new int[Integer.parseInt(args[0])];
		int [] array2 = new int[Integer.parseInt(args[1])];
		int [] array3 = {111,222,333,444};
		
		//3. Create a forth 2D array large enough to hold the contents of arrays 1-3
		int [][] array4 = new int [3][];
		
		array4[0] = new int [array1.length];
		array4[1] = new int [array2.length];
		array4[2] = new int [array3.length];
		
		//null pointer exception without lines [41.42.43];
		
		//4. Fill the first three arrays with random numbers from -20 - 100
		for (int x = 0; x < array1.length; ++x)
			array1[x] = sr.nextInt(120) - 20;
		for (int x = 0; x < array2.length; ++x)
			array2[x] = sr.nextInt(120) - 20;
		for (int x = 0; x < array3.length; ++x)
			array3[x] = sr.nextInt(120) - 20;
		
		
		//5. Fill in the 2D array 4 with the contents of the 1st 3 arrays
		 	for (int x = 0; x < array1.length; x++)
				array4[0][x] = array1[x]; 
			
			for (int x = 0; x < array2.length; x++ )
				array4[1][x] = array2[x];
			
			for (int x = 0; x < array3.length; x++ )
				array4[2][x] = array3[x];
		
					
		//6. Create a method that will accept a 2D array and print it out using enhanced 
		//for loops
		printA(array4);
		
		//7. Create a method that will accept as input an int array and return the average
		//of all the elements in the array
		
		System.out.println(averageA(array1));
		System.out.println(averageA(array2));
		System.out.println(averageA(array3));
	
		}
		else
			System.out.println("You failed to enter the correct number of arguments.");
	}
	
	public static void printA(int [][] array)
	{
		for (int [] temp : array)
		{
			for(int x : temp )
				System.out.print(x);
				System.out.println();
		}
	}
	
	public static int[] averageA(int [] array)
	{
		int a = 0;
		int i = 0;
			for(int temp: array)
			{
				a += temp;
			}
				int averageValue = (a/i);
					System.out.println(averageValue);
				int [] averageValueArray = new int [0];
					averageValueArray[0] = averageValue;
					return averageValueArray;
	}
	
}

/*
Answer the following questions: 
1. What does the index in an array actually mean?
	The numerical value associated with the location of data stored within the array
2. What is a multidimensional array really?
	A multidimensional array is an array of arrays to put it simply.
*/