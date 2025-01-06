package Package1;

public class Student1 //Pillar 1 -- Create the class --variable and Method
{
int rollno;
int age;
public void display1()
{
	System.out.println("Welcome to all of you");
}
public void display2()
{
	System.out.println("Automation is very Easy");
}
public static void main(String[] args) //Pillar 2 --- Create the Main Method;
  {
	Student1 Ram=new Student1(); // Pillar 3 -- Create the Object for access the Variable and Method
	Ram.display1(); // Pillar 4 --- access the variables and method using reference variable (Object)
	Ram.display2();
	Ram.rollno=35;
	Ram.age=25;
	System.out.println(Ram.rollno);
	System.out.println(Ram.age);
  }
}
