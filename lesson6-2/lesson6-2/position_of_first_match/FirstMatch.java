// Bluej project: lesson6/position_of_first_match
// Write a program that finds the first word in Alice In Wonderland
// that is longer than 9 characters, and if there are no words
// that long, prints "There are no long words".

import java.util.Scanner;
import java.io.FileReader;

public class FirstMatch
{
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;
        int counter = 0;

        final int THRESHOLD = 9;

        // TODO: Remember and print the position of the first word
        // longer than THRESHOLD characters.
        while (in.hasNext() && !found)
        {
            String word = in.next();
            counter++;
            if (word.length() > THRESHOLD)
            {
                longWord = word;
                found = true;
                counter--;
                
            }
        }
        if (found)
        {
            System.out.println("The first long word is " + longWord + " at position " + counter);
        }
        else
        {
            System.out.println("There are no long words");
        }
    }
}
