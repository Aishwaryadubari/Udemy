public class SpeedConverter {
    // write your code here
    public static long  toMilesPerHour(double kilometersPerHour )
    {
        if (kilometersPerHour<0)
        {
            return -1;
        }
        else
        {
            long total = Math.round(0.62150*kilometersPerHour);
            
            return total;
        }
        
    }
    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour< 0 )
        {
            System.out.println("Invalid Value");
        }
        else
        {
            
           
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour )+" mi/h");
        }
    }
}