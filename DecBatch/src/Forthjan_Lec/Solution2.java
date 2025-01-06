// Soltion 3 is using Method using call and print the values 
// Total call is 6 one for assigning the values
// 5 call for print the values

package Forthjan_Lec;

public class Solution2 
{
   int a,b,c,d;//e;
   public void method1(int a1,int b1,int c1,int d1)
   {
	a=a1;
	b=b1;
	c=c1;
	d=d1;
	//e=e1;	  
   }   
   public static void main(String[] args) 
   {
	Solution2 obj=new Solution2();
	obj.method1(11, 12, 13, 14); // Assigning the value
	System.out.println(obj.a);    // 5 call for print the values
	System.out.println(obj.b); 
	System.out.println(obj.c);
	System.out.println(obj.d);
	//System.out.println(obj.e);
   }
   
}
