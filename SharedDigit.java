public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int fNumber, int sNumber) {
  
     if(fNumber >= 10 && fNumber <= 99 && sNumber >= 10 && sNumber <= 99)
     {
        int x = fNumber % 10;
	   int y = sNumber % 10;
	   fNumber /= 10;
	   sNumber /= 10;
	   return (fNumber == sNumber || fNumber == y || x == sNumber || x == y);
     }
     else
     {
    
      return false;
      
    }
   
  
  }
}
  