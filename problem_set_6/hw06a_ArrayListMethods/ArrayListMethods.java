//
//Complete the class ArrayListMethods. It consists of four short methods to manipulate an array list of strings.
//The method header and javadoc are given to you.
//
//For the draft, provide the isSorted method.
//

import java.util.ArrayList;
public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Determine if the array is sorted.
        int i = 0;
        while (sorted && i < list.size()-1)
        {
            String firstString = list.get(i);
            for (int j = i + 1; j < list.size(); j++)
            {
                String secondString = list.get(j);
                if( firstString.compareTo(secondString) > 0)
                {
                    sorted = false;
                }
                
            }
            i++;
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use compareTo() to determine which string is larger (later in alphabetical
     * order.
     * * Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be: 
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {

        // TODO: Replace all but the first and last elements with the larger of its to neighbors
        for (int i = 1; i < list.size()-1; i++)
        {
            String myString = list.get(i);
            String leftString = list.get(i-1);
            String rightString = list.get(i+1);
            if(myString.compareTo(leftString) < 0)
            {
                myString = leftString;
            }
           if(myString.compareTo(rightString) < 0)
            {
                myString = rightString;
            }
            list.set(i,myString);
        }

    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;

        // TODO: Write the code to get the number of duplicates in the list
        for (int i = 0; i < list.size()-1; i++)
        {
            String firstString = list.get(i);
            for (int j = i + 1; j < list.size(); j++)
            {
                String secondString = list.get(j);
                if (firstString.equals(secondString))
                {
                    duplicates++;
                }
            }
        }

        return duplicates;
    }

     /**
     * Moves any word that startw with x, y, or z to the front of the arraylist, but
     * otherwise prserves the order
     * * Example: if the list is orginially
     *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
     * after this method is called it should be
     *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
     */
    public void xyzToFront()
    {
        //int insertAt = 0;
       ArrayList<String> frontList = new ArrayList<String>();
       ArrayList<String> backList = new ArrayList<String>();
       
       for (String s : list)
       {
           if( (s.startsWith("x")) || (s.startsWith("y")) || (s.startsWith("z")) )
           {
               frontList.add(s);
            }
            else
            {
                backList.add(s);
            }
        }
        list.clear();
        list.addAll(frontList);
        list.addAll(backList);

        // TODO:  Move any word that starts with x, y, or z to the front of the arraylist, but otherwise preserves the order

    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        return list.toString();
    }
}
