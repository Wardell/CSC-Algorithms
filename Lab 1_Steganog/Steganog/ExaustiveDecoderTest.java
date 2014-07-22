import static org.junit.Assert.*;

import org.junit.Test;


public class ExaustiveDecoderTest {

	@Test
	public void test() 
	{
		ExaustiveDecoder ed = new ExaustiveDecoder();
		//ed.decrypter("", "", "...-...-..-....-....--.-.-.-.");
		ed.decode("...-...-..-....-....--.-.-.-.");
		for(int i =0; i < ed.permutations.size();i++)
		{
			//System.out.println( ed.permutations.get(i));
		}
	}

}
