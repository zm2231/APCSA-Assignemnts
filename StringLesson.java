
import java.util.Scanner;

public class StringLesson {
  
public static void main(String[] args) {
String city; //declared only

city = new String ("Milton"); // instantiated
// (Primitivies are initialized! Objects are instantiated.)
// Or can do both: String city = new String ("Milton");

// Or can do: String name "Milton";
// Use " " for strings
String empty = " "; // Or String empty = " ";

// the length method gives the number (int) of characters in the String
int cityLength = city.length();

int middlelndex = cityLength/2;

// indexOf gives the index (int) of the first occurrence of the character
int firstlndex = city.indexOf('A'); // Use ' ' for chars

// substring (a, b) gives the characters from the ath index up to the bth index. Doesn't include the bth index!
String citySubstring = city.substring(0,4);

// this gives the characters from the 2nd character through the end of the string. Why length-I?
String citySubstring2 = city.substring(2, city.length() - 1);

// Or substring (a) gives the characters from the ath index through the end of the string
String citySubstring3 = city.substring(2);

System.out.println("The city is " + city);
System.out.println("The empty string is " + empty);
System.out.println("The city's length is " + cityLength);
System.out.println("The city's middle index is " + middlelndex);
System.out.println("The index of the first A is " + firstlndex);
System.out.println("The substring from O to 4 is " + citySubstring);
System.out.println("The substring from 2 is " + citySubstring2);
System.out.println(" Another way from 2 is " + citySubstring3);

Scanner scan = new Scanner(System.in);
System.out.println("Do you enjoy APCS? Enter Yes, Somewhat, or No.");

String answer = scan.nextLine();

if(answer.equalsIgnoreCase("Yes"))
System.out.println("Me Too!");
else if (answer.equalsIgnoreCase("Somewhat"))
System.out.println("Okay.");
else
System.out.println("Sad day.");

System.out.println("Please type your name: ");

String inName = scan.nextLine();



int nameLength = inName.length();

int nameIndex = inName.indexOf('a'); 

String nameSubstring1 = inName.substring(0,1); 
String nameSubstring2 = inName.substring(1,inName.length()); 
String nameSubstring3 = "ay"; 



System.out.println("The length of your name is " + nameLength + " characters long");


if (nameIndex > 0) {
System.out.println("The index of the first a is " + nameIndex);
} else {
System.out.println("There is no index for the character 'a'");
}

System.out.println("Your name in pig latin is " + nameSubstring2 + nameSubstring1 + nameSubstring3);

System.out.println("Please type in your grade for computer science!: ");

int grade = scan.nextInt();

if (grade >= 90) {
System.out.println("You have an A in the class, great job!");
} else if ((grade >= 80) && (grade < 90)) {
System.out.println("You have a B in the class, excellent work!");
} else if ((grade >= 70) && (grade < 80)) {
System.out.println("You have a C in the class, try putting in some more work!");
} else {
System.out.println("You have an F in the class, see if you can get that grade up!");
}

}

}