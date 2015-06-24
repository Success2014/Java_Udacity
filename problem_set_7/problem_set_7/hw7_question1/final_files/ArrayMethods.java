
//
// Complete the methods below. These methods manipulate Arrays of Strings
// For the draft, complete the first method
//

public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
        int i = 0;
        while(sorted && i < list.length-1)
        {
            String fT = list[i]; // first text
            String sT = list[i+1] ;// second text
            if(fT.compareTo(sT)>0)
            {
                sorted = false;
            }
            i++;
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {
        for(int i = 1; i < list.length-1; i++)
        {
            String myT = list[i];
            String leftT = list[i-1];
            String rightT = list[i+1];
            if(myT.compareTo(leftT)<0)
            {
                list[i] = list[i-1];
            }
            myT =list[i];
            if(myT.compareTo(rightT)<0)
            {
                list[i] = list[i+1];
            }
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
        
        for (int i = 0; i<list.length-1; i++)
        {
            String tmpString = list[i];
            for(int j = i+1; j < list.length; j++)
            {
                String cmpString = list[j];
                if(tmpString.equals(cmpString))
                {
                    duplicates++;
                }
            }
        }

        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the arraylist, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        for(int i = 0; i<list.length;i++)
        {
            if("xyzXYZ".contains(list[i].substring(0,1)))
            {
                String tmpString = list[i];
                for(int j = i; j > insertAt; j--)
                {
                    list[j] = list[j-1];
                }
                list[insertAt] = tmpString;
                insertAt++;
            }
           
        }

    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        String toPrint = "";
        for(int i = 0; i < list.length;i++)
        {
            if(i!=list.length-1)
            {
                toPrint = toPrint + list[i] + ", ";
            }
            else
            {
                toPrint = toPrint + list[i];
            }
        }
        toPrint = "[" + toPrint + "]";
        return toPrint;
    }
}