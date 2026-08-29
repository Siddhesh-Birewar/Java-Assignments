package pack1;



public class EvenOdd
{
  void EO(int num)
  
{
  if(num>0)
  {  System.out.println("Number is positive \n ");
	 if( num % 2 == 0 )
	 {
		 System.out.println("Number is even");
	 }
	 else
	 {
		 System.out.println("Number is odd");
	 }
  }
  else if(num<0)
  {
	System.out.println("Number is Negative\n");  
  }
  else
  {
	  System.out.println("Number is 0\n");
  }
}
}
