import java.util.ArrayList;
import java.util.List;

public class BackTracker
{
	public List findPermutations(List array)
	{
		
		List permutations = new ArrayList();
		List soFar = new ArrayList();
		findPermuntationshelper(soFar,array,permutations);
		return permutations;
	}
	
	// toGo "3;4;5;6;7"
	public void findPermuntationshelper(List soFar, List toGo,  List successes)
	{
		//success case
		//if toGo is empty, sucess!
		if(toGo.isEmpty())
		{
			successes.add(soFar);
			return;
		}
		//failure case = when is this needed?
		
		//for loop to try each element of toGo
		//"try" here means here means make a recursive call with a larger so far and a smaller toGo
		for(int index = 0; index < toGo.size();index++)
		{
			Integer i = (Integer)toGo.get(index);
			List<Integer> newSofar = new ArrayList<Integer>(soFar);
			newSofar.add(i);
		
			
			List<Integer> newToGo = new ArrayList<Integer>(toGo);
			newToGo.remove(i);
			findPermuntationshelper( newSofar,newToGo,successes);
		}
		//return successes;
	}
	
}
