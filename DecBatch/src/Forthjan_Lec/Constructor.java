package Forthjan_Lec;

public class Constructor 
{   
  public Constructor(int a,int b,int c)
  {
    System.out.println(" This is three Parameterized constructor");
  }
  public Constructor()
  {
    this(1,2,3);
    System.out.println(" This is Default Parameterized constructor");
  }
  public Constructor(int a)
  {
	this();
	System.out.println(" This is one Parameterized constructor");
  }
  public Constructor(int a,int b)
  {
	this(1); 
	System.out.println(" This is two Parameterized constructor");
  }
 
  public static void main(String[] args) 
  {
	Constructor Obj=new Constructor(1,2);
  }
}
