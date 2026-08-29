package pack9;

import java.util.Scanner;

class appliances {
	int price;
	static int star;
	int year;
	static Scanner in = new Scanner(System.in);

	final void turnOn() {
		System.out.println("Appliance is turning ON");
	}

	void getdetails() {
		System.out.println("Enter Year of manufacturing:");
		year = in.nextInt();
		System.out.println("Enter Price:");
		price = in.nextInt();
	}

	static void star() {
		System.out.println("Enter star rating:");
		star = in.nextInt();
	}
}

class washing_machine extends appliances {
	String brand;

	static void star() {
		System.out.println("Washing Machine Star Rating:");
		star = in.nextInt();
	}

	void inwashdet() {
		getdetails();
		System.out.println("Enter Brand:");
		brand = in.next();
	}

	void displayDetails() {
		System.out.println("Washing Machine details");
		System.out.println("Brand: " + brand);
		System.out.println("Year of Manufacturing: " + year);
		System.out.println("Price: " + price);
		System.out.println("Star Rating: " + star);
	}
}

class Refrigerator extends appliances {
	Refrigerator() {
		System.out.println("Refrigerator class instantiated.");
	}
}

public class staticv {
	public static void main(String[] args) {
		washing_machine wm = new washing_machine();
		wm.turnOn();
		wm.inwashdet();
		washing_machine.star(); // Calling static method
		wm.displayDetails();

		System.out.println();
		Refrigerator ref = new Refrigerator();
	}
}