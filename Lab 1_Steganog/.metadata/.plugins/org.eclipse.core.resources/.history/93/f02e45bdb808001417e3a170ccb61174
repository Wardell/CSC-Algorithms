import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import edu.neumont.ui.Picture;


public class SteganogTest {

	@Test
	public void image128() throws IOException {
		Steganog crypter = new Steganog();
		Picture image  =  new Picture("C:\\test.png");
		String  message = crypter.retreiveFromImage(image);
		System.out.println(message);

	}

	@Test
	public void image256() throws IOException {
		Steganog crypter = new Steganog();
		Picture image  =  new Picture("C:\\test256.png");
		String  message = crypter.retreiveFromImage(image);
		System.out.println(message);

	}

	@Test
	public void image512() throws IOException {
		Steganog crypter = new Steganog();
		Picture image  =  new Picture("C:\\test512.png");
		String  message = crypter.retreiveFromImage(image);
		System.out.println(message);

	}

}
