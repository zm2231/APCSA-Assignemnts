//******************************************************************* 
// ArrayListEssentials.java  
//  
// By Zain Merchant 
//******************************************************************* 
import java.util.Random; 
import java.util.ArrayList;
public class ArrayListEssentials { 
  public static void main(String[] args) {
    ArrayList<Integer> numList = new ArrayList<Integer>();
    int numItems = 0; 
    int recent = -5; 
    int sum = 0; 
    int b = 0;
    int maxValue = 20;
    int minValue = 20;
    for(int i = 0; i<20; i++) { 
      numList.add(recent+10); 
      recent = numList.get(i); 
      numItems++;  }
     System.out.println("This is the Array List Essentials Lab Code by Zain Merchant"); 
     System.out.println(""); 
    System.out.println("The array after loading the first 20 values is:"); 
    for (int f=0; f<numItems; f++) { 
      b = numList.get(f);
      sum = sum + numList.get(f); 
     if(b > maxValue){ maxValue = b; }
     if(b< minValue){ minValue = b; }
    } 
    System.out.println(numList);
    System.out.println("The sum is " + sum); 
    System.out.println("The average is " + (double)sum/(double)numItems); 
    System.out.println("The maxValue is " + maxValue); 
    System.out.println("The minValue is " + minValue); 
    
     int newVal = (int)(Math.random() * 803) + 196; 
      System.out.println("The random number is " + newVal); 
      numList.add(numItems, newVal);
             numItems = numItems +1; 
        System.out.println(numList);
        
        int ranVal = (int)(Math.random() * 195); 
        System.out.println("ranVal is = " + ranVal);
        if(ranVal>5&& ranVal<14) {numList.add(1, ranVal);}
        if(ranVal>15&& ranVal<24) {numList.add(2, ranVal);}
        if(ranVal>25&& ranVal<34) {numList.add(3, ranVal);}
        if(ranVal>35&& ranVal<44) {numList.add(4, ranVal);}
        if(ranVal>45&& ranVal<54) {numList.add(5, ranVal);}
        if(ranVal>55&& ranVal<64) {numList.add(6, ranVal);}
        if(ranVal>65&& ranVal<74) {numList.add(7, ranVal);}
        if(ranVal>75&& ranVal<84) {numList.add(8, ranVal);}
        if(ranVal>85&& ranVal<94) {numList.add(9, ranVal);}
        if(ranVal>95&& ranVal<104) {numList.add(10, ranVal);}
        if(ranVal>105& ranVal<114) {numList.add(11, ranVal);}
        if(ranVal>115& ranVal<124) {numList.add(12, ranVal);}
        if(ranVal>125& ranVal<134) {numList.add(13, ranVal);}
        if(ranVal>135& ranVal<144) {numList.add(14, ranVal);}
        if(ranVal>145& ranVal<154) {numList.add(15, ranVal);}
        if(ranVal>155& ranVal<164) {numList.add(16, ranVal);}
        if(ranVal>165& ranVal<174) {numList.add(17, ranVal);}
        if(ranVal>175& ranVal<184) {numList.add(18, ranVal);}
        if(ranVal>185& ranVal<194) {numList.add(19, ranVal);}
        System.out.println(numList);

System.out.println("length of the ArrayList is " + numList.size());  
int ran = (int)(Math.random() * 39);  
int keyToDel = ran*5;
while(keyToDel%10!=5) {
ran = (int)(Math.random() * 39);  
keyToDel = ran*5;
}
System.out.println("Now Deleting the number " + keyToDel + " from the string"); 
numList.remove(Integer.valueOf(keyToDel));
System.out.println(numList);
  } 
} 
     
