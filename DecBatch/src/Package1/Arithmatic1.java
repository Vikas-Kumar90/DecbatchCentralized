package Package1;

public class Arithmatic1 
{	
public int Sum(int a,int b)
{
	int c=a+b;
	System.out.println("The Sum of a+b="+c);
	return c;
}
public int Sub(int x,int y)
{
	int z=x-y;
	System.out.println("The Sub of x-y="+z); 
	return z;
}
public int  Mul(int r,int t)
{
	int w=r*t;
	System.out.println("The Mul of r*t="+w);
	return w;
}
public void devide(int f,int g)
{
	int h=f/g;
	System.out.println(+h);
}
//assignment1 ((((10+2)+2)-2)*2)/2)
public static void main(String[] args) 
{
  Arithmatic1 total=new Arithmatic1();

  int sumresult=total.Sum(10,2);
  int sumresult2=total.Sum(sumresult, 2);
  int subresult=total.Sub(sumresult2, 2);
  int Mulresult=total.Mul(subresult,2); 
  
  System.out.println("The final result of ((((10+2)+2)-2)*2)/2)= ");
  
  total.devide(Mulresult, 2);

  //assignment2 ((((10*2)-2)+2)-2)/2)
  Arithmatic1 tot=new Arithmatic1();

  int mulresult1=tot.Mul(10,2);
  int subresult2=tot.Sub(mulresult1, 2);
  int sumresult3=tot.Sum(subresult2, 2);
  int subresult3=tot.Sub(sumresult3, 2);
  
  System.out.println("The final result of ((((10*2)-2)+2)-2)/2)= ");
  
  tot.devide(subresult3, 2);	
}
}



