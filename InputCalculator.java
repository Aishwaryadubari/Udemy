import java.util.Scanner;
 
public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage()
    {
         int sum = 0, count = 0;
         double avg = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int value = sc.nextInt();
                sum += value;
                count++;
            } else if (count == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                avg = (double)sum/(double)count;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}