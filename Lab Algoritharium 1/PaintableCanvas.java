import  algoritharium.*;

import java.awt.Color;

//Important Notes
//Double click the algoritharium.jar file to load the gui
//Create a new picture, or load a picture
//Select Code -> Load and your DrBsPaintableCanvas.class file

//Eclipse should auto-compile every time you save your file

//Select Code -> Reload if you add methods, but otherwise, you probably shouldn't have to

public class PaintableCanvas {

	public void oneRedDot ( ) {
		//The following line grabs whatever image is currently loaded
		//so make sure you open an image, or use File -> New 
		Image img = ImageViewer.getImage();

		//The following line set's pixel (11,30) to RED.
		//That is 11 pixels over, and 30 pixels down
		img.setPixelColor(11, 30, Color.RED);
	}

	//This method puts on 5 red dots
	public void fiveRedDots(){
		Image img = ImageViewer.getImage();

		img.setPixelColor(20, 43, Color.RED);
		img.setPixelColor(21, 43, Color.RED);
		img.setPixelColor(22, 43, Color.RED);
		img.setPixelColor(23, 43, Color.RED);
		img.setPixelColor(24, 43, Color.RED);
	}

	//make the entire 10th row red
	public void tenthRowRed(){
		Image img = ImageViewer.getImage();
		//The following two methods look at the image and determine how wide and high it is
		//You will need to use these if you want to color the entire image generically
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		System.out.println("The image is " + numPixelsHigh + " pixels tall and " + numPixelsWide + " wide");

		

		for(int i = 0; i < numPixelsWide; i++){
				img.setPixelColor(i, 10, Color.RED);
	}
	}

	//make the entire 5th column blue
		public void fifthColumnBlue()
	{
		Image img = ImageViewer.getImage();
			int numPixelsHigh = img.getHeight();
			
	
		for(int i = 0; i < numPixelsHigh; i++) 
		{
				img.setPixelColor(5,i,Color.BLUE);
		}
	}

	//paint three large stripes on the image, the first red, second white, and third blue
	public void threeColors()
		{
		Image img = ImageViewer.getImage();
		
		int numPixelsHigh = img.getHeight();
		int numPixelsWide = img.getWidth();
		int portion = (numPixelsWide / 3);
		
		for(int i = 0; i < numPixelsWide; i++) 
		{
			for(int j = 0; j < numPixelsHigh; j++)
			{
				if (i <= (portion)) 
				{
					img.setPixelColor(i, j, Color.RED);
				}
				if (i > (portion) && i < (numPixelsWide - portion))
				{
					img.setPixelColor(i, j, Color.WHITE);
				}
				if (i >= (numPixelsWide - portion))
				{
					img.setPixelColor(i, j, Color.BLUE);
				}
				
			}
		}
		
	}	
			
	//paint black and white stripes (top to bottom) on the image, switching every 20th column
	public void zebraStripes(){
		Image img = ImageViewer.getImage();
			int numPixelsHigh = img.getHeight();
			int numPixelsWide = img.getWidth();
			boolean bw = true; //true for black
		
		for(int i = 0; i < numPixelsWide; i++) 
		{
			if (( i%20 ) == 0 )
				{
					bw = !bw;
				}
			for(int j = 0; j < numPixelsHigh; j++)
			{
				if (!bw)
				{
					img.setPixelColor(i, j, Color.BLACK);
				}
				else
				{
					img.setPixelColor(i, j, Color.WHITE);
				}
			}
		}
	}
	
	
	//paint black and white stripes (left to right) on the image, switching every 20th row
	public void jailBird()
	{
		Image img = ImageViewer.getImage();
			int numPixelsHigh = img.getHeight();
			int numPixelsWide = img.getWidth();
			boolean bw = true; //true for black
			
		for(int j = 0; j < numPixelsHigh; j++) 
		{
			if (( j%20 ) == 0)
				{
					bw = !bw;
				}
			for(int i = 0; i < numPixelsWide; i++)
			{
				if (!bw)
				{
					img.setPixelColor(i, j, Color.BLACK);
				}
				else
				{
					img.setPixelColor(i, j, Color.WHITE);
				}
			}
		}
		
	}
	
}
