package Task_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;

public class JToaster extends Toaster
{
	public static void main(String[] args)
	{
		JToaster toaster = new JToaster();
		BufferedImage img = null;
		try
		
		{
			img = ImageIO.read(new File("dog.jpeg"));
			
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
		toaster.setBackgroundImage(img);
		
		toaster.setToasterHeight(600);
		toaster.setToasterWidth(900);
	
		toaster.setToasterMessageFont(Font.decode("Copperplate Bold"));
		toaster.setMargin(200);

		toaster.setToasterColor(Color.DARK_GRAY);
		toaster.setBorderColor(Color.PINK);
		toaster.setMessageColor(Color.CYAN);

		while (true)
		{
			toaster.showToaster("\nGet a little rest, \n\nwill you?");
			toaster.setDisplayTime(15000);

			try
			{
				Thread.sleep(60000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
