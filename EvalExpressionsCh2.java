public class EvalExpressionsCh2
{
  public static void main (String[] args)
  {
    
    int answer = 0;
    double answer2 = 0.00;
    int a =3, b = 10, c=7;
    double w = 12.9, y= 3.2;
    
    answer = (int)a+b*(int)c;
    answer2 = (double)a+b*c;
      System.out.println("a+b*c = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)a-b-(int)c;
    answer2 = (double)a-b-c;
      System.out.println("a-b-c = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)a/b;
    answer2 = (double)a/b;
      System.out.println("a/b = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)b/a;
    answer2 = (double)b/a;
      System.out.println("b/a = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)a-b/(int)c;
    answer2 = (double)a-b/(double)c;
      System.out.println("a-b/c = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)w/(int)y;
    answer2 = (double)w/y;
      System.out.println("w/y = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)y/(int)w;
    answer2 = (double)y/w;
      System.out.println("y/w = " + answer +"_int, " + answer2 + "_double");
      
            answer = (int)a+(int)w/b;
    answer2 = (double)a+w/b;
      System.out.println("a+w/b = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)a%(int)b/(int)y;
    answer2 = (double)a%b/y;
      System.out.println("a%b/y = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)b%a;
    answer2 = (double)b%a;
      System.out.println("b%a = " + answer +"_int, " + answer2 + "_double");
      
      answer = (int)w%(int)y;
    answer2 = (double)w%y;
      System.out.println("w%y = " + answer +"_int, " + answer2 + "_double");
  }
}
      