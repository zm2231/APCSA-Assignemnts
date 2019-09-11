/**
 * @zm2231
 * @description: Program to calculate area and circumference of circle
 */
import java.util.Scanner;
class CalculateCircle
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      /*We are storing the entered radius in double
       * because a user can enter radius in decimals
       */
      double radius = sc.nextDouble();
      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
      radius = radius *2;
        System.out.println("double the radius is" + radius);
        //Area = PI*radius*radius
      double area2 = Math.PI * (radius * radius);
      System.out.println("The area of circle with double the radius is: " + area2);
      //Circumference = 2*PI*radius
      double circumference2= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle with double the radius is:"+circumference2) ;
        
   }
}