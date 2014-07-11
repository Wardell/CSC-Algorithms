import java.io.IOException;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.image.BufferedImage;
import edu.neumont.ui.Picture;

public class Steganog 
{
	private class Pixel
	{
		public int row;
		public int col; 
		public Color color;
		public String binaryRep;
		
		public Pixel(int row, int col, Color color, String binaryRep)
		{
			this.row = row;
			this.binaryRep = binaryRep;
			this.col = col;
			this.color = color;
		}
	}
	
	public Picture embedIntoImage(Picture cleanImage, String message) throws IOException 
	{ 
		//Picture crypticPic  =new Picture(message);
		BufferedImage temp = cleanImage.getBufferedImage();
		int width = cleanImage.width();
		int height = cleanImage.height();
		
		for(int row = 0; row < width; row++ )
		{
			for(int col = 0; col < height; col++)
			{
				//cleanImage.
			}
		}
		return null;
	}

	public String convertColor(Color color)
	{
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		String redRep  =  binaryConvert(red);
		
	
		
		String greenRep  =  binaryConvert(green);
		String blueRep  =  binaryConvert(blue);
		
		if(redRep.length() < 8)
		{
			
			while( redRep.length() < 8)
			{
				redRep = "0" + redRep;
			}
			
		}
		
		if(greenRep.length() < 8)
		{
			
			while( greenRep.length() < 8)
			{
				greenRep = "0" + greenRep;
			}
			
		}
		
		if(blueRep.length() < 8)
		{
			
			while( blueRep.length() < 8)
			{
				blueRep = "0" + blueRep;
			}
			
		}
		
		String result =  redRep + greenRep + blueRep;
		return result;
	}
	
	public String binaryConvert(int number)
	{
		String s = "";
		
		while(number != 0)
		{
		  s += number % 2;
		  number /= 2;
		}
		
		String corrected ="";
		for(int i = s.length() - 1; i > -1 ; i--)
		{
			corrected += s.charAt(i);
		}
		
		
		return corrected;
	}
	
	private int decimalConvert(String binary)
	{
		
	 int result  = 0;
	 int powerOf = 5;
	 for(int i  = 0; i < binary.length();i++)
	 {
		 
		//result  += Math.pow(Integer.parseInt(binary.substring(i, i+1)), powerOf;
		 result += Integer.parseInt(binary.substring(i, i+1)) * Math.pow(2, powerOf); 
		 powerOf--;
	 }
	 
	 return result;
	}
	
	public String retreiveFromImage(Picture imageWithSecretMessage) throws IOException
	{
		int width = imageWithSecretMessage.width();
		int height = imageWithSecretMessage.height();
		PrimeIterator primeNumber = new PrimeIterator(width  * height);
		ArrayList<Pixel> pixels = new ArrayList<Pixel>();
		int pixelIndex = 0;
		int currentPrime  = primeNumber.next();
		
		String message = "";
		for(int row = 0; row < width; row++ )
		{
			for(int col = 0; col < height; col++)
			{
				if(pixelIndex ==  currentPrime)
				{
					pixels.add(new Pixel(row,col, imageWithSecretMessage.get(col,row),""));
					currentPrime = primeNumber.next();
				}
				pixelIndex++;
			}
		}
		
		String letters = "";
		for(int index = 0; index < pixels.size(); index++)
		{
			pixels.get(index).binaryRep  =  convertColor(pixels.get(index).color);
			String l =  pixels.get(index).binaryRep;

			letters = "" + l.charAt(6) +  l.charAt(7) + 
					l.charAt(14) +  l.charAt(15) + 
					l.charAt(22) +  l.charAt(23);
			
			 int temp = decimalConvert(letters) + 32;
			 char letter = (char)temp;
			 message += letter + "";
			 letters = "";
		}
		
		return message;
	}

}
