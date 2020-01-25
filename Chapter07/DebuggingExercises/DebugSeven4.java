// Converts a string to lowercase, and 
// displays the string's length
// as well as a count of letters
public class DebugSeven4
{
   public static void main(String[] args)
   {
      String aString = "HELP!! I need to get 37 things DONE today!!"; 
      int numLetters = 0;
      int stringLength = aString.length(); //suppose it's 33
      int NotLetter = 0;
      System.out.println("In all lowercase, the sentence is: ");
      for(int i = 0; i < stringLength; i++)
      {
         char ch = Character.toLowerCase(aString.charAt(i));
         System.out.print(ch);
         if(Character.isLetter(ch))
            numLetters++;
         
         if(!Character.isAlphabetic(ch))
            NotLetter++;
      }
      int actualAmount = stringLength - NotLetter;
      System.out.println();
      System.out.println("The number of CHARACTERS in the string is " + stringLength);
      System.out.println("The number of LETTERS is " + actualAmount + " which is supposed to be the same as " + numLetters);
   }
}