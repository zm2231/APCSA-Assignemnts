//**********************************************
// RunBandBooster.java
// Zain Merchant
// 12/5/2019
//**********************************************
import java.util.Scanner;
public class RunBandBooster
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of a Band Booster: ");
        BandBooster bb1 = new BandBooster( scan.nextLine() );
        System.out.println("Enter the name of another Band Booster: ");
        BandBooster bb2 = new BandBooster( scan.nextLine() );
   
        for( int week=1; week<=3; week++)
        {
            System.out.println("Week " + week);
            System.out.print("Enter the number of boxes sold by " + bb1.getName() + " this week: ");
            bb1.updateSales( scan.nextInt() );
            System.out.print("Enter the number of boxes sold by " + bb2.getName() + " this week: ");
            bb2.updateSales( scan.nextInt() );     
            System.out.println();
        }
        
        System.out.println("Total Sales are:");
        System.out.println( bb1 );
        System.out.println( bb2 );
        
    }
}