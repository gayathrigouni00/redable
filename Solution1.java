import java.util.scanner;
public class Solution1{
char name;ch address;
int id;int rollno;int mobileno;int marks;
Student std=new student();
public void acceptStudentDetails(){
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
name=sc.toChararr[i];
for(int i=0;i<n;i++){
if(i>=2&&i<=30){
System.out.println("student name");
}
}
System.out.println("enter address"); 
address=sc.tochararr[i];
for(int i=0;i<n;i++){
if(i>5&&i<100){
System.out.println("student address"); 
} 
}
System.out.println("enter id"); 
id=sc.nextInt();
for(int i=0;i<n;i++){
System.out.println("student id contains only 5 digit numbers"); 
}
System.out.println("enter rollno");
rollno=sc.nextInt();
for(int i=0;i>0;i++){
System.out.println("rollno should be positive integer");
}
System.out.println("enter mobileno");
rollno=sc.nextInt();
for(int i=0;i<=n;i++){
if(i>0&&i<=9){
System.out.println("mobile number contains 10 digits"); 
} 
}
System.out.println("enter marks");
marks=sc.nextInt();
for(int i=0;i<n;i++)
{
if(i>=10&&i<=99){
System.out.println("marks contains only 2 digit numbers");    
}
}
}
public void setDetails(){
std.setName(name);
std.setAddress(address);
std.setId(id);
std.setRollno(rollno);
std.setMobileno(mobileno);
std.setMarks(marks);
}
public void getDetails(){
System.out.println("Name:".getName()); 
System.out.println("Address:".getAddress());
System.out.println("Id:".getId());
System.out.println("Rollno:".getRollno()); 
System.out.println("Mobileno:".getmobileno());
System.out.println("Marks:".getMarks());
}
public static void main(String args[]){
Solution1 obj=newsolution();
{
obj.acceptStudentDetails();
obj.setDetails();
obj.getDetails();
}
}
}
