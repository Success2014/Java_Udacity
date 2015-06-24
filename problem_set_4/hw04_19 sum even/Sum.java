
/**
 * Complete the method to find sum of all the even numbers less than or equal to the given
 * number. Use a loop
 */
public class Sum
{
   /**
    * Gets the sum of all the even numbers less than or equal to the given number
    * @param n the given number, th ceiling
    * @return the sum of all the even numbers less that the ceiling
    */

   public int sum(int n)
   {
       int sum = 0;
       for (int i = 0; i <= n; i++){
           if (i % 2 == 0){
               sum = sum + i;
            }
        }
        return sum;

   }
}
