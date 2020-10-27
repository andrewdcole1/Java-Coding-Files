 /*
 * Andrew Cole
 * T01081920
 * CS 1410
 * Dr Cantrell
 */
import java.util.Scanner;
 
public class ExceptionHandling
{
	public static void main(String[] args)
	{		
		int arithmetic1 = 0; 
		int arithmetic2 = 5;
		
		int[] intArray = {1,2,3,4,5};
		
		String nullString = null;
		
		String str = "I Still Cant Believe You Divided By Zero.";
		
		int sum = 0;
		int quotient = 0;
		Scanner scn = new Scanner(System.in);
		
			// Arithmetic Exception
			try
			{
				quotient = divide(arithmetic2,arithmetic1);
				System.out.println(quotient);
				System.out.println("The Division has been executed...");
			}
			catch (ArithmeticException E)
			{
				System.out.println(" Error: Int Divided by Zero! The World Is gonna explode now! Why would you ever Divide by Zero, DEAR GOD - PANIC !!!!!!!!!!!! ");
				System.out.println(E);
			}
			/*
			ArithmeticException refers to the division of any number by zero (0).
			*/
			
			//Array Index Exception
			try
			{
				System.out.println(intArray[6]);
				System.out.println("The Array Has Been Accessed and Printed...");
			}
			catch (ArrayIndexOutOfBoundsException E)
			{
				System.out.println(" Error: Array[] is greater than the Array elements!\n The array is 5 long, and you attempted to access beyond 5!");
				System.out.println(E);
			}
			/*
			ArrayIndexOutOfBoundsException refers to attempting to access an element that is greater than the arrays length.
			*/
			
			//Null Pointer Exception
			try
			{
				if(nullString.equals("Literally Anything"));
					System.out.println("The String are the same");
				System.out.println("The String has been analyzed and Printed...");
			}
			catch (NullPointerException E)
			{
				System.out.println(" Error: You cannot compare a null string to another string, it creations this error!");
				System.out.println(E);
			}
			/*
			NullPointerException refers to the comparison of two strings or other varibales where ones value is equivalent to null.
			*/
			
			//String Index Exception
			try
			{
				System.out.println(str.charAt(400));
				System.out.println("The String has been analyzed and Printed...");
			}
			catch (StringIndexOutOfBoundsException E)
			{
				System.out.println(" Error: You cannot compare a null string to another string, it creations this error!");
				System.out.println(E);
			}
			/*
			StringIndexOutOfBounds refers to the referencing of a strings character that exceed its length.
			*/
	}		
}