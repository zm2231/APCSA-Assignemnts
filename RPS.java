// *************
// Rock.java 
// @ZainMerchant
// AP Computer Science
// ************* 

import java.util.Scanner; 
import java.util.Random; 


public class RPS 
{ 
public static void main(String[] args) 
{ 
    String personPlay; // The user can play Rock (R) Paper (P) Scissors (S)
    String computerPlay = ""; // Computer also plays R, P, and S
    int computerInt; // Used for randomely generator numbers to determine move
    String response; 


    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    System.out.println();

    
    computerInt = generator.nextInt(3)+1; //generates a number for computers play
 
// Takes the randomely generated computer and turns it into a letter

    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 
    
    // Get the user's move from the scanner class 
    System.out.println("Enter your play: "); 
    personPlay = scan.next();
// Makes letter into upercase just incase it was lowercase
    personPlay = personPlay.toUpperCase(); 
// Print what the computer played
    System.out.println("Computer play is: " + computerPlay); 
// Rule out if it's a tie
    if (personPlay.equals(computerPlay)) 
       System.out.println("It's a tie!");
//uses if statements that have brackets to the outcome of the game
    else if (personPlay.equals("R")) {
         if (computerPlay.equals("S")) 
            System.out.println("Rock crushes scissors. You win!!");
         if (computerPlay.equals("P")) 
              System.out.println("Paper eats rock. You lose!!"); 
    }
         else if (personPlay.equals("P")) {
       if (computerPlay.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
       if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
         }
         else if (personPlay.equals("S")) {
         if (computerPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You win!!"); 
         if (computerPlay.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!"); 
         }
         

}

}