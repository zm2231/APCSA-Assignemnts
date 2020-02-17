import java.util.Scanner;
public class WhileDemo
{
  public static void main (String[] args)
  {
    //Example of a Count-controlled loop
    int count = 0, sum = 0;
      
    while (count <10)
    { sum = sum+ count;
      System.out.println("Count = " +count+ " and sum = " +sum);
      count++;
    }
    System.out.println("Done");
    // Example of a goal-controlled loop
    //Giak: to save 15$ per month until the total is at least $100
                         sum = 0; 
                       count= 0;
                       while (sum<100)
                         {
                           sum = sum+15;
                           count ++;
                           System.out.println("Total saved: $"+sum+" after " +count+ " month(s).");
                       }
                       System.out.println("YOu have at least $100");
                        // Example of a user-controlled loop
                       System.out.println("Enter an integer or -1 to quit.");
                       Scanner scan = new Scanner(System.in);
                       int value = scan.nextInt();
                       sum = 0;
                       count = 0;
                       
                       while (value != -1)
                         {
                         sum += value;
                           System.out.println("The sum is currently "+ sum);
                         System.out.println("Enter an integer or -1 to quit.");
                         value = scan.nextInt();
                         count ++;
                       }
                       System.out.println("YOu entered" + count + "numbers.");
                       }
}
                         
                         