
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{

   public int largestPowerOf2(int n)
   {
       int counter = 0;
       while (Math.pow(2,counter)<n){
           counter++;
        }
       return (int)Math.pow(2,counter-1);

   }
}
