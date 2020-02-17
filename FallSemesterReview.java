import java.util.Scanner;
  public class FallSemesterReview {
  public static void main(String[] args) {
    int i = 1;
    int num = 0;
    int min = 10000;
    int max = -10000;
    double sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("What was your favorite part of break?");
    String input = scan.nextLine();
      System.out.println("Your Favorite part of break was " + input + " which is " + input.length() + "characters long");
      System.out.println("The first character of your string is " + input.charAt(0) + " and the 2-4th characters are " + input.substring(1,4));
      Scanner scan2 = new Scanner(System.in);
      System.out.println("What do you like to do on New Years Day?");
    String input2 = scan2.nextLine();
        input2=input2.toLowerCase();
        if (input2.indexOf("sleep") != -1 ) {
          System.out.println("Zzzzz"); }
        else if (input2.indexOf("football") != -1) {
          System.out.println("Go Jackets!");}
        else System.out.println("Fun!");
        while (i < input2.length()) {
          System.out.println(input2.charAt(i));
          i+=2; }
        for (int count = 0; count < 4; count++) {
          System.out.println("Enter 4 numbers 1 number at a time");
          Scanner keyboard = new Scanner(System.in);
           num = keyboard.nextInt();
          System.out.println("The number you just entered is" + num);
          if (num > max) max =num;
          if (num < min) min = num;
          sum += num;
         
        }
        double average = sum/4;
    System.out.println("the average is " + average + " the mimumum is " + min + " and the maximum value is " + max);
  }
}