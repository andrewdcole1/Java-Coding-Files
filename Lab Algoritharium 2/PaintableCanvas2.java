import  algoritharium.*;

import java.awt.Color;

//Important Notes
//Double click the algoritharium.jar file to load the gui
//Create a new picture, or load a picture
//Select Code -> Load and your DrBsPaintableCanvas.class file

//Eclipse should auto-compile every time you save your file

//Select Code -> Reload if you add methods, but otherwise, you probably shouldn't have to

public class PaintableCanvas2 {

	/*
	 * When I coded this up, I had to think about there only being 1 single line.  That meant
	 * I needed to code it up different than before, where I had to repeat things for the entire image.
	 * 
	 * Also, I noticed that I could think about it like, draw to the right, interspersed with drawing down every 5
	 * 
	 * You can check for every 5 with (variable name)%5=0
	 * 
	 */
	public void steps ( ) {
	{
		Image img = ImageViewer.getImage();
			int numPixelsHigh = img.getHeight();
			int numPixelsWide = img.getWidth();
			boolean bDown = true; //true for black down
			boolean bSide = false; //true for black side to side
			
		for(int j = 0; j < numPixelsHigh; j++) 
		{
			if (( j%5 ) == 0)
				{
					bDown = !bDown;
				}
			for(int i = 0; i < numPixelsWide; i++)
			{
				if (( i%5 ) == 0)
				{
					bSide = bSide;
				}
				if (!bDown && bSide)
				{
					img.setPixelColor(i, j, Color.BLACK);
				}
			}
		}
	}

	public void squares(){
		Image img = ImageViewer.getImage();

			
		
		img.setPixelColor(1, 1, Color.BLACK);
		img.setPixelColor(1, 1, Color.DARK_GRAY);
		img.setPixelColor(1, 1, Color.LIGHT_GRAY);
	}

	public void boundaries(){
		Image img = ImageViewer.getImage();
		img.setPixelColor(1, 1, Color.DARK_GRAY);

		
	}
	
	public void random_Movement(){
		Image img = ImageViewer.getImage();
		img.setPixelColor(1, 1, Color.DARK_GRAY);
	}
	
}
