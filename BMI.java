/**
 * The purpose of this program is to accurately and efficiently caluclate your body mass index (BMI).
 * 
 * @author zmm2231
 * @version 9/12/19
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String target = "";
        Scanner in = new Scanner(System.in);
        double BMI;
        double kilograms;
        double meters;
        double height;
        double minBmi=  15.725;
          double maxBmi = 28.635;
        //Print program function/description
        System.out.println("Determine Your body mass index.");
        //Prompt user for input
        System.out.print("Enter your name (first last)  : ");
        String firstName = in.next(); 
        String lastName = in.nextLine();
        System.out.println(firstName+" "+lastName);
        System.out.println("");
        System.out.print("Weight in pounds (e.g. 175): ");
        String weight = in.next();
        System.out.println(weight);
        System.out.println("");
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String feet = in.next(); 
        String inches = in.nextLine();
        System.out.println(feet+" "+inches);
        System.out.println("");
        //Parse Strings
        double feet1   = Double.parseDouble(feet);
        double inches1 = Double.parseDouble(inches); 
        double weight1 = Double.parseDouble(weight);
        //Unit Conversions
        height= ((feet1*12)+inches1);
        kilograms= (weight1 * .45);
        meters= (height * .025);  
        //Calculate BMI
        BMI = (kilograms/(meters*meters));
        //Determine if if normal weight, overweight, or underweight
        if(BMI < 18.5)
            target = "You are underweight.";
        else if(BMI > 25)
            target = "You are overweight.";
        else 
            target = "Your weight is optimal.";
              
        
        System.out.println("");
        System.out.println("");
   
        System.out.println("Body Mass Index Calculator");
        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        System.out.println("");
        System.out.print("Name: ");
        System.out.print(firstName+lastName);
        System.out.println("");
        System.out.print("Height (m): ");
        System.out.print(meters);
        System.out.println("");
        System.out.print("Weight (kg): ");
        System.out.print(kilograms);
        System.out.println("");
        System.out.print("Body Mass Index (BMI): ");
        System.out.print(BMI);
        System.out.println("");
        System.out.print("Category: ");
        //System.out.print(target);
if (minBmi < BMI)
{
  if (BMI < maxBmi)
    System.out.println("Your BMI is within 15% of ideal so you are all good");

  
}



/* Enhance the program
 * The weight program would be a bit nicer if it didn't just give one number as the ideal weight for each sex. Generally a person's weight is okay if it is
 * within about 15% of the ideal. Add to your program so that in addition to its current output it prints an okay range for each sex-the range is from the 
 * ideal weight minus 15% or the ideal weight plus 15%.
 */
    } 
}