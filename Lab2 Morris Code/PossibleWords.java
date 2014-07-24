
public class PossibleWords implements Comparable<PossibleWords> 
{

	public float freq;
	public String word;
	
	public PossibleWords(float f, String s)
	{
		freq = f;
		word = s;
	}
	
	@Override
	public int compareTo(PossibleWords arg0) 
	{
		// TODO Auto-generated method stub
		int result=0;
		if(arg0.freq > this.freq)
		{
			result = 1;
		}
		
		else if(arg0.freq < this.freq)
		{
			result = -1;
		}
		return result;
	}
	
	@Override
	public String toString()
	{
		return word + " Frequency: " + " " + freq; 
	}
	
}
