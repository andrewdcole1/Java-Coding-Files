//Class composition demonstration
//10-1-2020
//-Dr. G

/*
Andrew Cole
T01081920
CS 1410
NOTES:
	//l1.getP2().isEqual(l2.getP1())
	//Point.isEqual(l1.getP2(), l2.getP1());
	//p1.printPoint(); //dynamic method
	//Point.printPoint(p1); //static method 
*/

//As you can see you can create multiple classes in one file as long as you don't make
//more than one "public."

//Why would this be a "bad" idea?

//our driver class for testing
	
public class Shapes
{
	
	public static void main(String[] args)
	{
		//Creating Points
		Point p1 = new Point(1,5);
		Point p2 = new Point(5,5);
		Point p3 = new Point(5,1);
		Point p4 = new Point(1,1);
		Point p5 = new Point(0,0);
		Point p6 = new Point(41,41);
		Point p7 = new Point(10,15);
		
		//Creating Lines w/ Points
		Line l1 = new Line(p1,p2);
		Line l2 = new Line(p2,p3);
		Line l3 = new Line(p3,p4);
		Line l4 = new Line(p4,p1);
		Line l5 = new Line(p5,p1);
		Line l6 = new Line(p3,p5);
		Line l7 = new Line(p6,p7);
		Line l8 = new Line(p7,p1);
		
		//Creating Squares w/Lines + Points
		Square s1 = new Square(l1, l2, l3, l4); //Good Square
		Square s2 = new Square(l1, l2, l6, l5); //Bad Square - Equal Line Check
		Square s3 = new Square(l1, l5, l7, l8); //Literally The Worst "Shape" Youll ever See. Test Boundaries and Is Square Condition
		
		//Testing Square Class Entirely
		
		//Square 1
		System.out.println("\nTesting Square 1 Class: \n");
		s1.printSquare();
		System.out.println("(T/F) Is It A Square? " + s1.isSquare());
		if(s1.isSquare())
			System.out.println("The Area Is: " + s1.getArea()); 
		
		//Square 2
		System.out.println("\nTesting Square 2 Class: \n");
		s2.printSquare();
		System.out.println("(T/F) Is It A Square? " + s2.isSquare());
		if(s2.isSquare())
			System.out.println("The Area Is: " + s2.getArea()); 
		
		//Square 3
		System.out.println("\nTesting Square 3 Class: ");
		s3.printSquare();
		System.out.println("(T/F) Is It A Square? " + s3.isSquare());
		if(s3.isSquare())
			System.out.println("The Area Is: " + s3.getArea()); 
		
		//Testing printLine Method
		System.out.println("\nTesting printLine Method ");
		l1.printLine();
		
		//Testing isLine Method
		System.out.println("\nTesting isLine Method: ");
		System.out.println("Testing Line 1: "+ Line.isLine(p1, p2)); //true
		System.out.println("Testing Bad Line: "+ Line.isLine(p1, p1));
		
		//Testing isEqual (Point) Method
		System.out.println("\nTesting isEqual (Point) Method ");
		System.out.println(Point.isEqual(p1,p2));
		System.out.println(Point.isEqual(p2,p3));
		
		//Testing isEqual (Point) Method
		System.out.println("\nTesting isEqual (Point) Method ");
		System.out.println(p1.isEqual(p2));
		System.out.println(p2.isEqual(p3));
		
		//Testing getLineLength Method
		System.out.println("\nTesting getLineLength Method: ");
		System.out.println(l1.getLineLength()); //dynamic testing
		System.out.println(l8.getLineLength()); 
	}
}

/*
create a class point with x and y coordinates
add appropriate getters, setters, and constructors
add a print method 
*/

class Point
{
	private int x;
	private int y;
	
	public void setX() {this.x=x;}
	public void setY() {this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	
	public Point()
	{
			x = 0;
			y = 0;
	}
	
	public Point(int x, int y)
	{
		if (x <= 40 && x >= 0) //if x is between 0 and 40
			this.x = x;
		if (y <= 40 && y >= 0) //if y is between 0 and 40
			this.y = y;
		if (x > 40) //if x is out of bounds
			this.x = 40;
		if (y > 40) //if y is out of bound
			this.y = 40;
	}
	
	public void printPoint() {System.out.println("x = " + x + "\ny = " + y);} //dynamic method
	//public static void printPoint() {System.out.println("x = " + p1.x + "\ny = " + p1.y);} //static method
	
	public boolean isEqual(Point p1) //dynamic
	{
		return (p1.getX() == this.x && p1.getY() == this.y);
	}
	
	public static boolean isEqual(Point p1, Point p2) //static
	{
		return (p1.getX() == p2.getX() && p1.getY() == p2.getY());
	}
	
}

/*
- create a class line made up of two points
- create private instance variables for upper and lower x and y bounds
- add appropriate getters, and setters
- add point constructors and 4 int constructors
- add a isLine method to make sure it is a legitimate line
- if a user tries to make a line that is not a valid line based on values and on bounds
- set points to null
- add a print method
*/

class Line
{
	private Point p1;
	private Point p2;
	
	public void setP1(Point p1) {this.p1 = p1;}
	public void setP2(Point p2) {this.p2 = p2;}
	public Point getP1() {return p1;}
	public Point getP2() {return p2;}
	
	public Point getp1()
	{
		return p1;
	}	
	
	public Point getp2()
	{
		return p2;
	}
	
	public void printLine()
	{
		p1.printPoint();
		p2.printPoint();
		
		System.out.println("x = " + p1.getX());
	}
	
	public Line()
	{
		p1 = new Point();
		p2 = new Point();
	}
	
	public Line(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public static int getLineLength(Line l1) //static
	{
		Point p1 = l1.getP1();
		Point p2 = l1.getP2();
		
		int lineLength = 0;
		lineLength = ((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));
		
		return lineLength;
	}
	
	public double getLineLength() //dynamic
	{
		double lineLength = 0;

			lineLength = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
		
		return lineLength;
	}
	
	public static boolean isLine(Point p1, Point p2)
	{
		boolean isLine = true;
		
			if((p1.getX() == p2.getX()) && (p1.getY() == p2.getY()));
				isLine = false;
			
		return isLine;
	}

}


//create a class square made up of 4 lines

//add bounds for the square

//add appropriate getters, and setters

//add point and line constructors

//add a isSqure method to make sure it is a legitimate square

//if a user tries to make a square that is not a valid square based on values and on bounds
//set points to null

//add a print method

class Square
{
	private Line l1;
	private Line l2;
	private Line l3;
	private Line l4;
	private boolean squareCheck;
	
	public Line getl1()
	{
		return l1;
	}	
	
	public Line getl2()
	{
		return l2;
	}	
	
	public Line getl3()
	{
		return l3;
	}	
	
	public Line getl4()
	{
		return l4;
	}
	
	public Square()
	{
		Line l1 = new Line();
		Line l2 = new Line();
		Line l3 = new Line();
		Line l4 = new Line();
	} 
	
	public Square(Line l1, Line l2, Line l3, Line l4)
	{
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		squareCheck = false;
	}
	
	public void setSquareCheck(boolean input)
	{
		squareCheck = input;
	}

	public boolean isSquare()
	{
		int check = 0;
		if (l1.getP2().isEqual(l2.getP1()) && l2.getP2().isEqual(l3.getP1()) && l3.getP2().isEqual(l4.getP1()) && l4.getP2().isEqual(l1.getP1())) //Points are Equal
			check++;
		if(l1.getLineLength() == l2.getLineLength() && l1.getLineLength() == l3.getLineLength() && l1.getLineLength() == l4.getLineLength()) //Line Lengths are Equal
			check++;
		
		if(check == 2)
		{
			setSquareCheck(true);
			return true;
		}
		
		return false;
	}
	
	/*
	public static int getArea(Square s1) //static
	{
	int squareArea = 0;

		Line l1 = s1.getl1();
		Line l2 = s1.getl2();
		
		//squareArea = (getLineLength(l1) * 2);

		return squareArea;
	} 
	*/
	
	public double getArea() //dynamic
	{
		double squareArea = 0;
		if(squareCheck == true)
		{
			squareArea = (l1.getLineLength() * 2);
			return squareArea;
		}
		System.out.println("The Shape Is Not A Square, Area !NULL");
		return squareArea;
	}
	
	public void printSquare()
	{
		System.out.println("Point 1 is: ("+l1.getP1().getX()+", "+l1.getP1().getY()+")"); //Top Left Coordinate
		System.out.println("Point 2 is: ("+l2.getP1().getX()+", "+l2.getP1().getY()+")"); //Top Right Coordinate
		System.out.println("Point 2 is: ("+l3.getP1().getX()+", "+l3.getP1().getY()+")"); //Bottom Right Coordinate
		System.out.println("Point 2 is: ("+l4.getP1().getX()+", "+l4.getP1().getY()+")"); //Bottom Left Coordinate
	}
	
}


