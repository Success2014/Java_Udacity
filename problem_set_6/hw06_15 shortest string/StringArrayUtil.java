
//
// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
//

import java.util.ArrayList;
public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      // TODO: initialize the string the hold the shortest string
      String shortest = words.get(0); //initialize
      for (String tmpWords:words)
      {
          if (tmpWords.length() < shortest.length())
          {
              shortest = tmpWords;
            }
        }

      // TODO: Write the code to find the shortest string

      return shortest;
   }
}
