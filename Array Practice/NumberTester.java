 /*
 * Andrew Cole
 * T01081920
 * CS 1410
 * Dr Cantrell
 */
public class NumberTester {

	public static void main(String[] args) 
	{
		
		testFindIntegerMax();
		testAddAllPositiveIntsTogether();
		testGetTheIntAverage();
		testIsNegativeValue();
		
	}

	public static void testSimpleMethod()
	{	
		
		 System.out.println(simpleMethod(5));
		
	}

	//This method should return exactly what it was given
	//This method is not graded and will be demonstrated in class
	public static int simpleMethod(int i)
	{
		
		return i;
	
	}
	
	//I would like you to write 3 test cases to see if findIntegerMax is working correctly
    public static void testFindIntegerMax()
	{
		
		int [] testingArray = {1, 55, 26, 72, 94, 88, 76, 66, 102, 2, 68, 91}; //102
		int [] testingArray2 = {3, 24, 32, 6, 97, 100, 104, 99, 71, 58}; //104
		int [] testingArray3 = {1, 3, 5, 7, 10, 34, 4, 1, 0, 35}; //35
		System.out.println(findIntegerMax(testingArray));
		System.out.println(findIntegerMax(testingArray2));
		System.out.println(findIntegerMax(testingArray3));
		
	}
	
	//This method should take an array of integers and return the max array value
	//Implement it with an enhanced for loop and don't use a built in array method
	public static int findIntegerMax(int [] arrayMax)
	{
		int max = 0;
		
		for(int i = 0; i < arrayMax.length; i++)
		{
				if(arrayMax[i] > max) 
				{
						max = arrayMax[i];
				}
		}
		
		return max;
	}

	//I would like you to write 4 test cases that would test and make sure the addAllPositiveIntsTogether works correctly
	public static void testAddAllPositiveIntsTogether()
	{
		
		int [] testingArray = {2, -1, -5, 7, 1, 11}; //21
		int [] testingArray2 = {-1, -5, -6, -10, -2}; //0
		int [] testingArray3 = {1, 3, 5, 10, 19}; //38
		int [] testingArray4 = {1, 1, 1, 3, 2, 10, -20}; //18
		System.out.println(addAllPositiveIntsTogether(testingArray));
		System.out.println(addAllPositiveIntsTogether(testingArray2));
		System.out.println(addAllPositiveIntsTogether(testingArray3));
		System.out.println(addAllPositiveIntsTogether(testingArray4));
		
	}
	
	//This method should add up all the positive numbers in the given array
	public static long addAllPositiveIntsTogether(int [] arrayPositiveAddition)
	{
		int positiveGrowth = 0;
		
		for(int i = 0; i < arrayPositiveAddition.length; i++)
		{
				if(arrayPositiveAddition[i] > 0) 
				{
						positiveGrowth += arrayPositiveAddition[i];
				}
		}
		
		return positiveGrowth;
	}
	
	//I would like you to write 5 test cases that would test and make sure the GetTheIntAverage method works correctly.
	
	public static void testGetTheIntAverage()
	{
		
		int [] testingArray1 = {2, -1, -5, 7, 1, 11}; //2.5
		int [] testingArray2 = {-1, -5, -6, -10, -2}; //-4.8
		int [] testingArray3 = {1, 3, 5, 10, 19}; //7.6
		int [] testingArray4 = {1, 1, 1, 3, 2, 10, -2}; //2.285
		int [] testingArray5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100}; //14.5
		System.out.println(getTheIntAverage(testingArray1));
		System.out.println(getTheIntAverage(testingArray2));
		System.out.println(getTheIntAverage(testingArray3));
		System.out.println(getTheIntAverage(testingArray4));
		System.out.println(getTheIntAverage(testingArray5));
		
	}
	
	//This method should return the int value average for all values in the int array sent to it
	public static double getTheIntAverage(int [] arrayAverage)
	{
		double sumOfElements = 0;
		int numOfElements = 0;
		
		for(int i = 0; i < arrayAverage.length; i++)
		{
			sumOfElements += arrayAverage[i];
			numOfElements++;
		}
		
		double averageOfArray = (sumOfElements / numOfElements);
		
		return averageOfArray;
	}
	
	//I would like you to write 6 test cases that would test and make sure the IsNegativeValeu method works correctly.
	public static void testIsNegativeValue()
	{
		
		int [] testingArray1 = {2, -1, -5, 7, 1, 11}; //true
		int [] testingArray2 = {-1, -5, -6, -10, -2}; //true
		int [] testingArray3 = {1, 3, 5, 10, 19}; //false
		int [] testingArray4 = {1, 1, 1, 3, 2, 10, -2}; //true
		int [] testingArray5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100}; //false
		int [] testingArray6 = {11, 7, 12, 91}; //false
		System.out.println(isNegativeValue(testingArray1));
		System.out.println(isNegativeValue(testingArray2));
		System.out.println(isNegativeValue(testingArray3));
		System.out.println(isNegativeValue(testingArray4));
		System.out.println(isNegativeValue(testingArray5));
		System.out.println(isNegativeValue(testingArray6));
	
	}
	
	//This method checks an array and tests to see if it contains a negative value
	public static boolean isNegativeValue(int [] negativeCheckArray)
	{
		for(int i = 0; i < negativeCheckArray.length; i++)
		{
			if (negativeCheckArray[i] < 0)
				return true;
		}
		
		return false;
	}
	
}