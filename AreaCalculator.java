public class AreaCalculator {
     public static double area(double radius)
     {
         if(radius>=0)
         {
         double total = 3.14159 * radius * radius;
         return total;
         }
         else
         {
             return -1.0;
         }
     }
     public static double area(double x, double y)
     {
         if(x>=0 && y>=0)
         {
         double total = x * y;
         return total;
         }
         else
         {
             return -1.0;
         }
         
     }
}