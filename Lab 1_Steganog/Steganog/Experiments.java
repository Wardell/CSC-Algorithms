import java.util.ArrayList;
import java.util.List;
public class Experiments {

	public static int iterativeFactorical(int number)
	{
	  int num = number -1;
	  
	  while(num > 1)
	  {
		  number *= num;
		  num--;
	  }
	 
	  return number;
	  
	  
	}
	
	public static int recursiveFactorial(int number)
	{
		int num =  number * --number;
		if(number < 1)
			return num;
		
		else
		{
			
			return recursiveFactorial(number);
		}
	}
	public static void main(String[] args)
	{
		//System.out.println(iterativeFactorical(8));
		//System.out.println(recursiveFactorial(8));
		BackTracker bt = new BackTracker();
		ArrayList <Integer> numberArray  = new ArrayList();
		numberArray.add(2);
		numberArray.add(3);
		numberArray.add(5);
		numberArray.add(9);
		
		List array = new ArrayList();
		array = bt.findPermutations(numberArray);
		for(int i= 0; i < array.size();i++)
		{
			List temp =  (List)array.get(i);
			for(int j = 0; j < temp.size() ;j++)
			{
				
				System.out.print(temp.get(j));
			}
			System.out.println();
		}
		}
	
	
}
