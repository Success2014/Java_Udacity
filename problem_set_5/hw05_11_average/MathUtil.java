// hw05_11
//
// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
//
// Keep a running total and keep track of the number of entries
// then find and return the average
//
// Be sure not to divide by 0. Return 0 if no scores are entered
//

import java.util.Scanner;
public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        double average = 0;
        int sum = 0;
        int counter = 0;
        Scanner in = new Scanner(System.in);
        int value = 0;
        
       System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
        while((value = in.nextInt())>=0)
        {
            
            //value = in.nextInt();
            sum = sum + value;
            counter++;
            System.out.print("Enter a score. -1 to quit: ");
        }
        
        if (counter == 0)
        {
            return 0;
        }
        else
        {
            average = sum * 1.0 / counter;
            return average;
        }

    }
}
