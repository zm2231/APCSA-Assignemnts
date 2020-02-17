import java.util.Scanner;

class vowelCount
{
 public static void main(String args[]) 
 {
     int r1 = 0, r2 = 0;
     int vowels = 0, digits = 0, blanks = 0, consonants = 0, punc = 0;
   while (r1 == r2) {
  String str;

Scanner scan = new Scanner(System.in);

  System.out.print("My name is Zain Merchant, Enter a String (lowercase only) : ");
  str = scan.next();
 vowels = 0; consonants = 0; digits = 0; blanks = 0; punc = 0;
  for(int i = 0; i < str.length(); i ++)
  {
   char ch = str.charAt(i);
   if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++blanks;
            }
            else {
              ++punc;
            }
  }

  System.out.println("Vowels : " + vowels);
  System.out.println("Consonants: " + consonants);
  System.out.println("Digits : " + digits);
  System.out.println("Blanks : " + blanks);
    System.out.println("Punctuation marks : " + punc);
  Scanner keyboard = new Scanner(System.in);

  System.out.print("Do you want to play again? Enter 1 for no and 0 for yes");
  r1 = keyboard.nextInt();
 
     
 }
   }}
