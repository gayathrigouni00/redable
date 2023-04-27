import java.util.Scanner;
public class Solution2{
int []arr=new int[5];
int fact=0;
public void AcceptArrayelements(){
Scanner sc=new Scanner(System.in);
System.out.println("enter array elaements");
arr=newint[5];
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0){
System.out.println("even elements in an array");
}
}
for(int i=0;i<arr.length;i++){
if(arr[i]%2!=0){
System.out.println("odd elements in an array");
}
}
for(int i=0;i<arr.length;i++){
if(arr[i]%2==0&&factarr[i]==2){
System.out.println("prime elements in an array");
}
}
for(int i=0;i<arr.length;i++){
if(arr[i]==arr[i]%10){
 System.out.println("pallendrome numbers in an array");
}
}
}
public void setDetails(){
array.setEven(even);
array.setOdd(odd);
array.setPrime(prime);
array.setPallendrome(pallendrome);
}
public void getDetails(){
System.out.println("Even"+std.getEven());
System.out.println("Odd"+std.getOdd());
System.out.println("Prime"+std.getPrime());
System.out.println("Pallendrome"+std.Pallendrome());
} 
public static void main(String args[]){
Solution2 obj=new Solution2();
obj.AcceptArrayElements();
obj.setDetails();
obj.getDetails();
}
}