import java.util.Scanner;
public class Solution1{
public static void main(String[] args) {
int acbal=10000,wcount=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter withdraw amount");
int amount=sc.nextInt();
if(amount%100==0)
{
if(amount<=(acbal-500))
 {
  if(amount<=10000)
   {
 acbal=acbal-amount;
    wcount++;
     System.out.println("available bal:"+acbal);
  }
   else{
     System.out.println("withdraw limit is 10000 only");
   }
 }
  else{
    System.out.println("insufficient fund in your account");
  }
 }
  else{
    System.out.println("please enter multiples of 100 only");
  }
  }
}