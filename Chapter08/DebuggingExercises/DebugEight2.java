// Sum and average an array of integers
public class DebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35, 6, 65, 9};
      int tot = 0;
      int x;
      for(x = 0; x < someNums.length; ++x) 
        tot += someNums[x];
      
      double av = tot / (double)someNums.length; //need to static cast either dividend or divisor to 'double' to avoid it being truncated as int
      System.out.println("Sum is" + tot);
      System.out.println("Average is " + av); //this 'tot' is not the average
   }
}
