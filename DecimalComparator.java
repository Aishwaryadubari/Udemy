
public class DecimalComparator{
 public static boolean areEqualByThreeDecimalPlaces(double x, double y)
 {
    
     
     x = x * 1000;
    y= y * 1000;
    int a = (int)(x);
    int b = (int)(y);
    
    if (a==b)
     {
         return true;
     }
     else
     {
         return false;
     }
 }
}