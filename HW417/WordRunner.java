
import static java.lang.System.*;
import java.util.*;
import java.util.ArrayList;
public class WordRunner
{
	public static void main ( String[] args )
	{
		Word x = new Word("dog");
		Word y = new Word("cat");
		System.out.println( x.compareTo(y) );
		
		List<Word> words = new ArrayList<Word>();
		words.add(x);
		words.add(y);
		words.add(new Word("snake"));
		words.add(new Word("alligator"));
		Collections.sort(words);
		
		for(int i = 0; i < words.size(); i++){
		    System.out.println(words.get(i).toString());
		  }
		
		//make a list of Word
		//call Collections.sort() and sort the list
		//print the list
  }
}