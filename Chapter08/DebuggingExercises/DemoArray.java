public class DemoArray
{
   public static void main(String[] args)
   {
    double[] salaries = {12.25, 13.55, 14.25, 16.85} ;
    System.out.println("Salaries one by one are: ");
    for(double salary : salaries) 
    {
       System.out.println("A salary is : " + salary);
    }

   }
}
