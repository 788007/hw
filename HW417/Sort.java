
import static java.lang.System.*;
import java.util.Arrays;

public class Sort
{
	public static void main ( String[] args ){
		Comparable[] creatureList = new Creature[3];
		//add 3 creatures to creatureList
		creatureList[0] = new Creature(5);
		creatureList[1] = new Creature(2);
		creatureList[2] = new Creature(3);
		
		Arrays.sort(creatureList);  		//will throw an exception until
											//creatures are added to the array		
		
		for(Comparable it : creatureList)
		{
			out.println(it);
		}		
  }
}