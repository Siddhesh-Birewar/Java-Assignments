package pack1;
import java.util.Scanner;



public class MainOp
{	
     public static void main(String[] args)
     {
    	 
    	 Scanner in= new Scanner(System.in);
    	 System.out.println("Enter a number: ");
    	 int num=in.nextInt();
    	 EvenOdd eo=new EvenOdd();
    	 eo.EO(num);
    	 
	

	 }

}
