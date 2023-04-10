import java.util.Scanner;
public class Solution5{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a string");
 String str=sc.nextLine();
  String str1=sc.nextLine();
  String str2=sc.nextLine();
  System.out.println("even index characters positions followed by odd index positions");
  for(int i=0;i<str.length();i++)
  {
  if(i%2==0)
  { System.out.println("even index positions"+str1);
  }
  if(i%2!=0)
  {
    System.out.println("odd index positions"+str2);
  }
  System.out.println("repstr with even and odd index positions");
  }
  }
}