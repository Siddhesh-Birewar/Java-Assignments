package pack6;

import java.util.Scanner;

public class MainStud {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int r, m;
		String n;

		student s = new student();
		System.out.println(" Enter Roll no = ");
		r = cin.nextInt();
		s.setRoll_no(r);
		System.out.println("Enter Name = ");
		n = cin.next();
		s.setName(n);
		System.out.println("Enter Marks = ");
		m = cin.nextInt();
		s.setMarks(m);

		System.out.println("ROll no is " + s.getRoll_no());
		System.out.println("Name is " + s.getName());
		System.out.println("Marks  is " + s.getMarks());

	}

}
