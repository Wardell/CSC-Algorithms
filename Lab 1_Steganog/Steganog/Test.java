

import java.io.IOException;

import edu.neumont.ui.Picture;
public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//PrimeIterator it = new PrimeIterator(10);
		//System.out.println(it.next());  // prints out 2
		//while ( it.hasNext() ) {
		 // System.out.println(it.next()); // prints out 3, 5, and 7 before hasNext returns false
		//}
		
		Steganog crypter = new Steganog();
		Picture image  =  new Picture("C:\\test.png");
		String  message = crypter.retreiveFromImage(image);
		System.out.println(message);

	}

}
