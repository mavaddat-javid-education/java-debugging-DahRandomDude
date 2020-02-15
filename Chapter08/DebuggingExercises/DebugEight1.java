// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid
import javax.swing.*;
public class DebugEight1
{
   public static void main(String args[])
   {
      char userCode;
      String entry, message;
      boolean found = false;
      char[] okayCodes = {'A','C','T','H'};
      StringBuffer prompt = new 
          StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
      for(int x = 0; x < okayCodes.length; ++x)
      {
          prompt.append(okayCodes[x]);
          if(x != (okayCodes.length - 1)) //Place a comma between every valid code. Do not place comma after last valid code. For example, the output could be "A, C, T, H".
             prompt.append(", ");     
      }
      entry = JOptionPane.showInputDialog(null,
         prompt); //get code from user as a String
      userCode = entry.toLowerCase().charAt(0); //convert String to char
      for(int i = 0; i < okayCodes.length; ++i)
      {
         if(userCode == Character.toLowerCase(okayCodes[i]) )
         {
            found = true;
         }
      }
      if(found)
         message = "Good code";
      else
         message = "Sorry code not found";
      JOptionPane.showMessageDialog(null, message);
   }
}