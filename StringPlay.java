public final class StringPlay
{
 public static void main(final String[] args)
 {
  final String college = new String(" Georgia Institute of Technology");
  final String town = "Atlanta, Georgia"; // part (a)
  int stringLength;
  String change1, change2, change3;
  stringLength = college.length(); // part (b)
  System.out.println(college + " contains " + stringLength
    + " characters.");
  change1 = college.toUpperCase();// part (c)
  change2 = change1.replace('O', '*');
  change2.toString();
  change3 = town.concat(college);// part (e)
  System.out.println("The final string is " + change3);
 }
}
