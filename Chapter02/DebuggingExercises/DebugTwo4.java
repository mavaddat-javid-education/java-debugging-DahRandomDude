import javax.swing.JOptionPane;
public class DebugTwo4
{
   public static void main(String[] args)
   {
     String costString;
       double cost;
       final double TAX = 0.06;
       costString = JOptionPane.showInputDialog(null,"Enter price of item you are buying", "Purchases",
          JOptionPane.INFORMATION_MESSAGE);
       cost = Double.parseDouble(costString);
       JOptionPane.showMessageDialog(null,"With " + (TAX * 100) +
        "% tax, purchase is $" + String.format("%.2f", (cost + cost * TAX)));
   }
}
