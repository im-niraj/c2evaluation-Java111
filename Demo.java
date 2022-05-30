package com.c2evaluation;
import java.util.Scanner;
public class Demo {
	static int sumofmarks;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of student");
		int noOfstudent = scanner.nextInt();
		
		Student[] student = new Student[noOfstudent];
		
		for(int i=0; i<noOfstudent; i++) {
			System.out.println("Enter rollnumber");
			int roll = scanner.nextInt();
			System.out.println("Enter name");
			String name = scanner.next();
			System.out.println("Enter Address");
			String addressString = scanner.next();
			System.out.println("Enter marks");
			int marks = scanner.nextInt();
			student[i] = new Student(roll,name,addressString,marks);
		}
		scanner.close();
		
		for(int i=0; i<noOfstudent; i++) {
			sumofmarks += student[i].marks;
			System.out.println(student[i]);
		}
		System.out.println("Average Marks of "+noOfstudent+" is "+(sumofmarks/noOfstudent));
		
		
		
	}

}

class Student{
	int roll;
	String nameString;
	String address;
	int marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String nameString, String address, int marks) {
		this.roll = roll;
		this.nameString = nameString;
		this.address = address;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", nameString=" + nameString + ", address=" + address + ", marks=" + marks
				+ "]";
	}
	
	
}