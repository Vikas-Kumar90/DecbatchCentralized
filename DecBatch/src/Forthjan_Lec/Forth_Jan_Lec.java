//Constructor Use

package Forthjan_Lec;

public class Forth_Jan_Lec 
{
public Forth_Jan_Lec()
{
	System.out.println("This is a Default Constructor");
}
public Forth_Jan_Lec(int a)
{
	System.out.println("This is one Parameterized Constructor");
}
public Forth_Jan_Lec(int a,int b)
{
	System.out.println("This is two Parameterized Constructor");
}
 public static void main(String[] args) 
{
	Forth_Jan_Lec obj =new Forth_Jan_Lec();
	Forth_Jan_Lec obj1 =new Forth_Jan_Lec(1);
	Forth_Jan_Lec obj2 =new Forth_Jan_Lec(1,2);
}

}

