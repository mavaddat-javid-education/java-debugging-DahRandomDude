// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
public class DebugSeven2
{
   public static void main(String[] args)
   {
      String str;
      int x;
      int length;
      int start = 0;
      int num;
      int lastSpace = -1;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of integers separated by spaces >> ");  //for example "1 2 3 4"
      str = in.nextLine(); //str = "1 2 3 4"
      length = str.length(); //length = 7
      for(x = 0; x < length; ++x) //x goes from 0 to 6, when x is 7, the for-loop  quits before execution 
      { //str.charAt(0) = '1'
        //str.charAt(1) = ' '
         if(str.charAt(x) == ' ')   //false when x = 0
                                    //true when x = 1
         {
             partStr = str.substring(lastSpace + 1 , x); //x = 1, lastSpace +  1 =   0
                                                         //x = 1, str.substring(0, 1) = "1"     
             num = Integer.parseInt(partStr);  //x = 1, Integer.parseInt("1")  = 1 => num
             System.out.println("                " + num);
             sum += num;
             lastSpace = x;
          } 
      }
      partStr = str.substring(lastSpace + 1, length);
      num = Integer.parseInt(partStr);
      System.out.println("                " + num);
      sum += num;
      System.out.println("         -------------------" +
         "\nThe sum of the integers is " + sum);
   }
}