import java.util.Scanner;
public class IdealWeight
{
    public static void main (String[] args)
    {
        int feet, inches, totalInches;        
        int femaleWeight, maleWeight;
        double femaleWeightMax, femaleWeightMin, maleWeightMin, maleWeightMax;
        
        Scanner scan = new Scanner( System.in );
        System.out.println( "This program will calculate the ideal weight for both a male and a female given the height in feet and inches...");
        System.out.print("Enter the height in feet: ");
        feet = scan.nextInt();
        System.out.print("Enter the height in inches: ");
        inches = scan.nextInt();
        System.out.println("You entered a height of " + feet + "' " + inches + "\"");
        
        totalInches = feet*12 + inches; 
        femaleWeight = 100 + (totalInches - 60)*5;
        maleWeight = 106 + (totalInches - 60)*6;
        
        femaleWeightMax = femaleWeight*1.15;
        femaleWeightMin = femaleWeight*.85;
        maleWeightMax = maleWeight*1.15;
        maleWeightMin = maleWeight*.85;
        System.out.println("The ideal weight for a female is between " + femaleWeightMin + "-" + femaleWeightMax + " pounds.");
        System.out.println("The ideal weight for a female is between " + maleWeightMin + "-" + maleWeightMax + " pounds.");
        
    }
}