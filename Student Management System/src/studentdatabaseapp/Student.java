package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
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
	public void enroll() {
		// Get inside a loop, user hits 0 when done
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} 
			else { 
				System.out.println("Break!");
				break; 
			}
		} while (1 != 0);
			System.out.println("ENROLLED IN: " + courses);
			System.out.println("TUITION BALANCE: " + tuitionBalance);
			
	}
	
	// View Balance
	
	// Pay tuition 
	
	// Show status
}
