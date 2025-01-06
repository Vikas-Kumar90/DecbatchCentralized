// Soltion 3 is using constructor using less call 

package Forthjan_Lec;

public class Solution3 //Class name is Solution3
{
	   int a,b,c,d,e,f;
	   public Solution3(int a1,int b1,int c1,int d1,int e1)
	   // Constructor name is also same as class name = Solution3
	   {
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;	  
	   }   
	   public static void main(String[] args) 
	   {
		Solution3 obj=new Solution3(11, 12, 13, 14, 15);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	   }
	   
	}

// Here Constructor is use for reducing the lines in code