// This class discounts prices by 10%
public class DebugFour4
{
   public static void main(String args[])
   {
      final double discountRate = 0.90;
      int price = 100;
      double price2 = 100.00;
      tenPercentOff(price, discountRate);
      tenPercentOff(price2, discountRate);
   }
   public static void tenPercentOff(int p, double dR)
   {
      double newPrice = p * dR;
      System.out.println("Ten percent off "  + p);
      System.out.println("  New price is " + newPrice);
   }
   public static void tenPercentOff(double p2, double dR)
   {
      double newPrice = dR*p2;
      System.out.println("Ten percent off " + p2);
      System.out.println("  New price is " + newPrice);
   }
}
