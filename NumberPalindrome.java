public class NumberPalindrome {
 public static boolean isPalindrome(int number)
 {
    number = Math.abs(number);int r=0;int sum=0; int temp = number;   
  while(number>0){    
   r=number%10;  //getting remainder  
   sum=(sum*10)+r;    
   number=number/10;    
  } 
  if (temp==sum){
      return true;
  }
  else
  {
      return false;
  }
 }
}