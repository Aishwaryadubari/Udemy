public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number) {
//       

        int lastDigit = 0;
        if(number >= 0){
            lastDigit = number % 10;

            while (number > 9){
                number = number / 10;
            }

            
            return number + lastDigit;
        } else

        
        return -1;
    }
}