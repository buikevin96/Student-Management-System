package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's grade level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();

		System.out.println("Name: " + firstName + " " + lastName + " - " + "Year: " + gradeYear + " - " + "ID: " + studentID);
		
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	
	// View Balance
	
	// Pay tuition 
	
	// Show status
}
