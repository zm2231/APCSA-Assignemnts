import java.util.ArrayList;
public class ArrayListProgram
{
  public static void main (String[] args)
  {
    System.out.println("Number 1");
    ArrayList<String> quote = new ArrayList<String>();
    quote.add("Programs");
    quote.add("must");
    quote.add("be");
    quote.add("written");
    quote.add("for");
    quote.add("people");
    quote.add("to");
    quote.add("read");
    quote.add("and");
    quote.add("only");
    quote.add("incidentally");
    quote.add("for");
    quote.add("machines");
    quote.add("to");
    quote.add("execute");    
    System.out.println(quote);
    
    System.out.println("Number 2");
    for(int i = 0; i <= quote.size() - 2; i += 2) {
        String str = quote.get(i + 1);
        quote.set(i + 1, quote.get(i));
        quote.set(i, str);
    
}
    System.out.println(quote);
    
    System.out.println("Number 3");
   
      for (int i = 0; i<quote.size(); i++)  {
        String fox = "fox";
        String red = "red";
        if(quote.get(i).compareTo("fox") < 0) { quote.remove(i);i--;}
        if(quote.get(i).compareTo("red") > 0) { quote.remove(i);i--;}
       }
    System.out.println(quote);
    
System.out.println("Number 4");
    for(int i=0; i<quote.size(); i++) {
      if(quote.get(i).length()==4) {
        quote.add(i, "****"); i++; }
    }
    System.out.println(quote);
    System.out.println("Number 5");
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(9);
    nums.add(0);
    nums.add(4);
    nums.add(5);
    nums.add(0);
    nums.add(-1);
    nums.add(8);
    nums.add(2);
    nums.add(0);
    nums.add(0);
    nums.add(3);

    System.out.println(nums);
System.out.println("Number 6");
    int min = nums.get(0);
    for(int x : nums ){
      if (x < min) {
        min = x;
   }
}
      System.out.println("minimum is: "+min);
      int item = min;
      int itemPos = nums.indexOf(min);
      nums.remove(itemPos);
      nums.add(0, min );
      System.out.println(nums);
      
      
      System.out.println("Number 7");
       for (int i = 0; i<nums.size(); i++) {
     if(nums.get(i)==0) {
        nums.remove(i); i--;  
    }
  }
       System.out.println(nums);
       System.out.println("Number 8");
         for(int i = 0; i < nums.size() - 2; i += 3) {
         Integer temp1 = nums.get(i);
         Integer temp2 = nums.get(i + 2);
         nums.set(i, temp2);
         nums.set(i + 2, temp1);
       }
         System.out.println(nums);
      
   }
  }

    
    
  


    

    
    

  
//}
      