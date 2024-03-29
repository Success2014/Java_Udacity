// BlueJ project: lesson9/quiz1
import java.util.Scanner;

/**
   This program shows a simple quiz with two questions.
*/
public class QuestionDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");
        
        Question second = new Question();
        second.setText("Who was the founder of Udacity?");
        second.setAnswer("Sebastian Thrun");

        // Make another question second that asks
        // "Who was the founder of Udacity?".
        // The answer is "Sebastian Thrun"

        int score = 0;
        score = score + presentQuestion(first, in);
        // Present the second question
         score = score + presentQuestion(second, in);
        System.out.println("Your score: " + score);
    }

    /**
       Presents a question to the user and obtains a response.
       @param q the question to present
       @param in the scanner from which to read the user input
       @return the score (1 if correct, 0 if incorrect);
    */
    public static int presentQuestion(Question q, Scanner in)
    {
        // Display the first question
        q.display();
        System.out.println("Your answer:");
        String response = in.nextLine();
        // Check whether the response was correct
        
        if (q.checkAnswer(response))
        {
           
            System.out.println("true");
            return 1;
        }
        else
        {
            System.out.println("false");
            return 0;
        }
        // If so, print "true" and return 1
        // Otherwise, print "false" and return 0
    }
}
