import java.util.Scanner;
public class Solution5{
double bal;
public BankAccount(double initialBalance){
this.bal=initialbal;
}
public void deposite(double amount){
 bal=bal+amount;
}
public void withdraw(double amount){
if(amount>bal){
bal=bal-amount;
}
}
public double getBalance(){
return balance;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Solution5 obj=newSolution5();
int option=0;
do{
System.out.println("enter 1 to deposite");  
System.out.println("enter 2 to withdraw"); 
System.out.println("enter 3 to check"); 
System.out.println("enter 0 to return"); 
option=sc.nextInt();
Switch(option);
{
Case1:{
System.out.println("enter amount to deposite");
double b=sc.nextDouble();
obj.deposite(d);
break;
}
Case2:{
System.out.println("withdraw the amount"); 
double b=sc.nextDouble();
obj.withdraw(w);
break;
}
Case3:{
 System.out.println("check the amount"); 
double b=sc.nextDouble();
obj.withdraw(c);   
}
}
}
}