package pack4;
import java.util.Scanner;

public class VehDet 
{
 int VehId,model,price;
 String VehName;
 Scanner in=new Scanner(System.in);
 
 void SetData()
 {
	 System.out.println("Enter Vehicle Details:");
	 
	 System.out.println("Enter Vehicle Name:");
	 VehName=in.next();
	 
	 System.out.println("Enter Vehicle Id:");
	 VehId=in.nextInt();
	
	 System.out.println("Enter Vehicle Model:");
	 model=in.nextInt();
	 
	 System.out.println("Enter Vehicle Price:");
	 price=in.nextInt();
	 
}
 void Display()
 {
	 System.out.println("Car Details are:");

	 System.out.println(" Vehicle Name: "+VehName);
	
	 System.out.println(" Vehicle Id : "+VehId);

	 System.out.println(" Vehicle Model :"+model);
	 
	 System.out.println(" Vehicle Price :"+price);

 }
}
