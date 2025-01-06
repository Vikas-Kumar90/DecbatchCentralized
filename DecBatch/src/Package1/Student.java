package Package1;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

//{} indicate this is called body of class.
public class Student
{
 int rollno;
 int age; // datatype variable name;
 public void display() //() indicate this is a method
 {
	  System.out.println("Welcome to all of you");
 }
 public static void main(String[] args)
 {
	Student akshay= new Student();// object creation
	akshay.display();
	akshay.display();
	akshay.rollno=47;// calling + assign
	System.out.println(akshay.rollno);
	akshay.rollno=555;
	System.out.println(akshay.rollno);
 }
}
  
 