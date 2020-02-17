import java.util.Scanner;
public class TurkeyPractice
{
  public static void main (String[] args)
  {
    String response;
    String response2;
    Scanner scan = new Scanner(System.in); 
    System.out.println("What are you thankful for?");
    response = scan.nextLine();
    System.out.println("You are thankful for " + response + " and that word is " +response.length()  + " characters long");
    //response = response.toUpperCase;
   System.out.println(" The first t in your response is at the " + (response.indexOf('t')) + " character");
   System.out.println(" The last s in your respponse is at the " + (response.lastIndexOf('s'))); 
   System.out.println(" The first letter of your response is " + (response.charAt(0)));   
   System.out.println(" The 3rd and 4th ltter of your response is " + (response.charAt(2)) + " and " + (response.charAt(3)));
   System.out.println(" The response you typed in without the first letter is " + response.substring(1));
   
   
   Scanner keyboard = new Scanner(System.in);
   System.out.println("What is your favorite food to eat on Thanksgiving Day? (Capitalize only the first letter of each word)");
   response2 = keyboard.nextLine();
   if (response2.equals("Turkey")) {
     System.out.println("gobble gobble"); }
   else if (response2.equals("Pumkin Pie")) {
     System.out.println("Yum!"); }
      int i = response2.length();
      System.out.println("Your word backwards is: ");
        while(i>0)
        {
          System.out.print(response2.charAt(i-1)); 
          i--;
        }
        System.out.println("");
        Scanner res = new Scanner(System.in);
            double average;
        int  count=0, sum=0, num=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;   
        System.out.println("Please enter 5 numbers");
        for(i = 0; i< 5; i++) {
        if(num>max) max=num;
        if(num<min) min=num;
        num=res.nextInt();
        sum+=num;
        }
         average = sum/5;
        System.out.println("Your average is "+average);
        System.out.println("The sum is: "+sum);    
        System.out.printf("Your maximum number is %d\n",max);
   
  }
  
}
      