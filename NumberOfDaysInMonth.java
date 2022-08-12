public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year)
    {if (year>=1 && year <= 9999)
     {
         if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         {
             return true;
         }
         else
         {
             return false;
         }
     }
     else
     {
         return false;
     }
 }
 public static int getDaysInMonth(int month, int year)
 { int daysInMonth = 0;
 if ((year>=1 && year <= 9999) && (month >=1 && month <=12)){
     if (month == 4 || month == 6 || month == 9 || month == 11) {
   daysInMonth = 30;
   return daysInMonth;
} else if (month == 2) {
    daysInMonth = isLeapYear(year) ? 29 : 28;
    return daysInMonth;
}
else { 
    daysInMonth = 31;
    return daysInMonth;
}
}
else
{
    return -1;
}
 }
}