//hw04_07
/**
 * Complete the method below so that it returns the correct letter grade
 * for the number grade and return the letter grade as a string
 */
public class GradeBook
{
    /*
     * Gets the letter grade associated with this numberic grade
     * @param grade the numeric grade
     * @return the corresponding letter grade
     */

    public String getLetterGrade(int grade)
    {
        if (grade>=90 && grade<=100){
            return "A";
        }
        else if (grade>=80 && grade<=89){
            return "B";
        }
        else if(grade>=70 && grade<=79){
            return "C";
        }
        else if(grade>=60 && grade<=69){
            return "D";
        }
        else if(grade>=0 && grade <=59){
            return "F";
        }
        else{
            return "Invalid grade";
        }

    }
}
