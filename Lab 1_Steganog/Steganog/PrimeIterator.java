import java.util.Iterator;


public class PrimeIterator implements Iterator<Integer> {


	private boolean[] isPrime;
	int nextNumber  = 0;
	public PrimeIterator(int max) 
	{		 
			//primeNumbers = new List<Integer>();
	        isPrime = new boolean[max + 1];
	        for (int i = 2; i <= max; i++) {
	            isPrime[i] = true;
	        }

	        for (int i = 2; i*i <= max; i++) {

	            if (isPrime[i]) {
	                for (int j = i; i*j <= max; j++) {
	                    isPrime[i*j] = false;
	                }
	            }
	        }
	}
	@Override
	public boolean hasNext() {
		
		while( nextNumber < isPrime.length && !isPrime[nextNumber]  )
		{
			nextNumber++;
		}
		
		if( nextNumber < isPrime.length)
		{
		 return true;
		}

		return false;
	}

	@Override
	public Integer next() {
		
		while(nextNumber < isPrime.length && !isPrime[nextNumber] )
		{
			if(!isPrime[nextNumber])
			{
			  nextNumber++;
			}
			
		}
		
		return nextNumber++;
		
	}

}
